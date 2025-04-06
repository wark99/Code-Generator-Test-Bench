// BookService.java

package com.example.bookapi.service;

import com.example.bookapi.model.Book;
import com.example.bookapi.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        Author author = new Author(book.getAuthor());
        book.setAuthors(List.of(author));
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);
        if (existingBook == null) {
            return null;
        }
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPages(updatedBook.getPages());
        // Update authors
        List<Author> newAuthors = updatedBook.getAuthors();
        if (!newAuthors.isEmpty()) {
            authorRepository.deleteAll(Author::equalsToUpdatedAuthor);
            for (Author author : newAuthors) {
                Author existingAuthor = authorRepository.findById(author.getId()).orElse(null);
                if (existingAuthor == null) {
                    existingAuthor = new Author(author.getName(), author.getNationality());
                    authorRepository.save(existingAuthor);
                }
                // Update book authors
                existingBook.setAuthors(List.of(existingAuthor));
            }
        }
        return bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

