<<<<<<< SEARCH
=======
package com.exampleapp.core.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class User extends BaseEntity {
    @Id
    long id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    Date createdAt;

    @Column(nullable = false)
    Date updatedAt;
}
>>>>>>> REPLACE

