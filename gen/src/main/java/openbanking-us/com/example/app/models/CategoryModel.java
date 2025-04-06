package com.example.app.models;

import org.hibernate.modelDao.Dao;
import org.hibernate.modelorm.Jasper;
import java.util.OrderedCollection;
import java.util.Map;

public class CategoryModel extends BaseCategory {
    @Jasper
    @Embedded("id")

    public String name;
    public static final int PARENT = 12345; // Default parent id

    @Embedded("parent", java.util.List<String>)
}

