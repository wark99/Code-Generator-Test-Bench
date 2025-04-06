package com.example.app.models;

import org.hibernate.modelDao.Dao;
import org.hibernate.modelorm.Jasper;
import java.util<Object;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class AdminUserModel extends AdminUserBase {
    @Jasper
    @Embedded("id")
    @Embedded("username", "password")

    public static final String NULL = "null";
    
    @Embedded("created_at", "updated_at")

    public String username;
    public String password;
}

