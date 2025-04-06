package com.example.data;

import net.alkative.jpf JPAAnno;

public class Category implements Serializable {
    @Id
    public String id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false, unique = true)
    public Date createdAt;
}

