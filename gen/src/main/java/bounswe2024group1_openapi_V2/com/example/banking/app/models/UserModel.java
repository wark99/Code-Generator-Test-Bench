package com.example.banking.app.models;

import com.example.banking.app.DTOmodel.UserDTO;
import java.util.Date;
import java.util.TimeZone;

public class UserModel extends AbstractEntity {
    @Id
    private int userId;

    @Property(propertyName = "username")
    @Column(name="username", dataType="VARCHAR(255)")
    private String username;

    @Property(propertyName = "email")
    @Column(name="email", dataType="VARCHAR(100)")
    private String email;

    @Property(propertyName = "password")
    @Column(name="password", dataType="VARCHAR(60)")
    private String password;

    @Property(propertyName = "isAuthenticated")
    @Column(name="isAuthenticated", dataType="boolean")
    private boolean isAuthenticated;

    public void createUser() {
        // Implementation to create a new user
    }

    public void loginUser(@Transactional
    void loginUser(String username, String password) throws BusinessException {

        // Implementation to log in an existing user
    }
}

