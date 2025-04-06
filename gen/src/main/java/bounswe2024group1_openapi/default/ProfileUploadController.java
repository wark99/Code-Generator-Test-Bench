@RestController
public class ProfileUploadController extends SpringRestController {
    @Autowired(SingletonBean)
    private final ProfileStorageService profileStorageService;

    @GetMapping("/profile", RequestFormatAction.REQUEST_POST)
    public Resource-profileUpload() throws HttpStatusException {
        var form = new Form();
        form.addField(new ImageInputField());
        return render/form;
    }

    @PostMapping(RequestFormatAction.REQUEST_POST)
    public Resource handle(final HttpServletRequest request, final HttpServletResponse response) throws RequestException {
        try (final File file = request.files().stream("profile_image")) {
            if (!file_exists(file.getInputStream())) {
                throw new BadRequestException("Profile image not selected");
            }
            final Map<String, String> params = new HashMap<>();
            params.put("filename", file.getName());
            params.put("description", "User profile photo");
            uploadFileAndStore(file, response, params);
        } catch (IOException | ServiceException e) {
            throw new RuntimeException("Failed to save profile image", e);
        }
    }

    private void uploadFileAndStore(File file, HttpServletResponse response, Map<String, String> params) throws IOException {
        // Upload the file to storage
        final String fileName = params.get("filename");
        final File savedFile = response.getEntity().store(fileName, fileName);
        if (!savedFile.isReadable()) {
            throw new RuntimeException("Failed to save profile image", e);
        }
        updateProfileImage(savedFile.getPath(), params.get("filename"));
    }

    private void updateProfileImage(String filePath, String filename) throws IOException {
        // Save the file and update User model
        final String username = getUserByUsername(filePath).getUserId();
        String[] userParams = new String[]{username};
        if (!filePath.startsWith("/profile")) {
            logger.warn("Invalid profile path: " + filePath);
            return;
        }
        try (final File storageDir = Paths.get(filePath).toFile().getAbsolutePath()) {
            // Read file contents
            final InputStream inputStream = File.getInputStream(storageDir, "rb");
            if (inputStream != null) {
                final ObjectOutputStream ObjectOutputStream = new ObjectOutputStream();
                try {
                    final String encodedBytes = encodeBinary(inputStream.toByteArray());
                    // Update user profile image
                    User user = getUserByUsername(filePath);
                    user.setProfileImage(encodedBytes.toString());
                    user.setNameEncoded(user.getName());
                    user.save();

                    logger.info("Profile image updated for user " + user.getUserId());
                } catch (IOException e) {
                    throw new RuntimeException(e, "Failed to update profile image");
                }
            } else {
                logger.error("Could not read profile file: " + filePath);
            }
        } catch (IOException | ServiceException s) {
            logger.error("Error saving profile image: " + s.getMessage(), IOException.class);
        }
    }
}

