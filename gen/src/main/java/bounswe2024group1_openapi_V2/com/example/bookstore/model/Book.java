package com.example.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Optional import if using Lombok for boilerplate reduction
import lombok.Data;

@Entity
@Data // If you're using Lombok, this will generate getters, setters, toString, etc.
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private int yearPublished;
}

