@Service(SingletonBean)
public class PasswordResetService {

    @Autowired(FileSystem)
    private final FileSystem fileSystem;

    @Method
    public void sendResetLink(String email) throws IOException {
        logger.info("Sending password reset link for user: " + email);
        // Implement sending the reset link via service (e.g., to a different service or module)
    }
}

