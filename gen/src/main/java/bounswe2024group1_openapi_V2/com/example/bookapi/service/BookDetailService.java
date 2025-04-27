// BookDetailService.java
package com.example.bookapi.service;

import com.example.bookapi.model.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookDetailService {

    @Autowired
    private BookDetailRepository bookDetailRepository;

    public BookDetail getBookDetails(Long bookId) {
        Optional<BookDetail> optionalBookDetail = bookDetailRepository.findById(bookId);
        if (optionalBookDetail.isPresent()) {
            return optionalBookDetail.get();
        } else {
            throw new RuntimeException("Book detail not found");
        }
    }

    public BookDetail createBookDetail(Long bookId, BookDetail bookDetail) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setIsbn(bookDetail.getIsbn());
            book.setPublicationDate(bookDetail.getPublicationDate());
            return bookDetailRepository.save(bookDetail);
        } else {
            throw new RuntimeException("Book not found");
        }
    }
}

