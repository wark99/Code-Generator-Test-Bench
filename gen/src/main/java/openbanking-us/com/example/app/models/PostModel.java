package com.example.app.models;

import org.hibernate.modelDao.Dao;
import org.hibernate.modelorm.Jasper;
import java.util<Object;

import static org.junit.Assert.*;

public class PostModel extends BasePost {
    @Jasper
    @Embedded("id")

    public String content;
    public String category;
}

