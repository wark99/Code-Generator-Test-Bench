// BookDetail.java
package com.example.bookapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private int publicationDate;

    public BookDetail() {}

    public BookDetail(String isbn, int publicationDate) {
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public int getPublicationDate() { return publicationDate; }
    public void setPublicationDate(int publicationDate) { this.publicationDate = publicationDate; }

}

