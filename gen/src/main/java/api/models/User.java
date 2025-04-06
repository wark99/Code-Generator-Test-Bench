package models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@SpringBootApplication;

public class User {
    @Autowired
    private String id;
    @Autowired
    private String name;
    @Autowired
    private String email;
    @Autowired
    private String password;
    @Autowired
    private Integer createdAt;

    // Accessors
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public Integer getCreatedAt() { return createdAt; }
}

