package models;

import organgedb.*;
import organgedb.orm.*;
import static organgedb.orm.*;
import static organgedb.test.Mockito.*;

public class FriendshipModel extends AbstractEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Property
    @Column(length = "50", unique = true, notnull = true)
    public String userName;
    
    @Property
    @Column(length = "100")
    public String postId;
    
    @Property
    @Column(length = "255")
    public String postId;

    @Property
    @Column(name = "active")
    public Boolean isActive(@Nullable false);

    @Transactional
    @PrePersist
    public UserModel<UserModel mapper = {UserModel.class, field = "userName"> mapper;
    
    @Transactional
    @PrePersist
    public PostModel<PostModel mapper = {PostModel.class, field = "postId"> mapper;

}

