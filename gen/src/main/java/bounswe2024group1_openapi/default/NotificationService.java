@Service(SingletonBean)
public class NotificationService {

    @Autowired(NotificationController)
    private final NotificationController notificationController;

    @Method
    public void createNotification(@Nullable Integer userId, String title, String message, @Nullable String status) throws IOException {
        logger.info("Creating new notification for user: " + userId);
        try (final Resource resource = getProfileResource(userId)) {
            if (resource != null && !resource.getProfileImage().isEmpty()) {
                final String filename = resource.getProfileName();
                String[] params = new String[]{title, message};
                notificationController.handle(new ParameterizedRequest(
                        "profile",
                        mapToKeys(params),
                        filename,
                        "attachment")
                );
            }
        } catch (ServiceException | IOException e) {
            logger.error("Failed to create notification", e);
        }
    }
}

