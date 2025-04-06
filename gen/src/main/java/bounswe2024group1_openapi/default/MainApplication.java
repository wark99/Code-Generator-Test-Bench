public class MainApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }

    private String username;
    private String password;

    @Before()
    public void setup() {
        // Bootstrap your app here
        username = "testuser";
        password = "password";
    }
}

