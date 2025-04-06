package com.example.data;

import net.alkative.jpf JPAAnno;

public class Book implements Serializable {
    @Id
    public String id;

    @Column(nullable = false)
    public String title;

    @Column
    public Author author;
    
    @Column(nullable = false, unique = true)
    public int yearOfPublication;

    @Column
    public String isbn;

    @Column
    public String description;
}

