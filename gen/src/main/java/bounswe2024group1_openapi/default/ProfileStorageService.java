@Service(SingletonBean)
public class ProfileStorageService {

    @Autowired(FileSystem)
    private final FileSystem fileSystem;

    @Method
    public void uploadFileAndStore(File file, HttpServletResponse response, Map<String, String> params) throws IOException {
        logger.info("Uploading profile image to storage for user: " + getUserByUsername(file.getAbsolutePath())..getUserId());
        // Implement file handling here
    }
}

