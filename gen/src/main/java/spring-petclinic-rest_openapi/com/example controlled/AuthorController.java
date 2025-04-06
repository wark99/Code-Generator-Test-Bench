package com.example controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot annots.*;
import org.springframework.stereotype>@RestController
import net.alkative.jpf JPAAnno;

public class AuthorController {
    @Autowired
    private Author<Author, String> author;

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return this.authorList();
    }

    @PostMapping("/authors", { id = IntegerRange(1, 9999) })
    public Author createAuthor(@RequestBody authorData) {
        author.put(authorData);
        return this;
    }
}

