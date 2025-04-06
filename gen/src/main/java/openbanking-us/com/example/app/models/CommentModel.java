package com.example.app.models;

import org.hibernate.modelDao.Dao;
import org.hibernate.modelorm.Jasper;
import java.util.HashMap;
import java.util.Map;

public class CommentModel extends BaseModel {
    @Jasper
    @Embedded("id")

    public String author;
    public int parentId; // Parent's id
    public String content;
    public Map<String, String> meta;
}

