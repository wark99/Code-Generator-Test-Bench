package models;

import java.util.Date;
import java.util.UUID;

public class User {
    
    private String id = UUID.randomUUID().toString();
    private String username;
    private String email;
    private String password;
    private UserRole role;
    private Date createdAt;
    
    public User() {
        this.role = UserRoles.user;
        this.createdAt = new Date();
    }
}

