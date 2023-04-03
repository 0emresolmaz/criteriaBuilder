package com.criteriabuilder.cbuilder.controller;
import com.criteriabuilder.cbuilder.model.Book;
import com.criteriabuilder.cbuilder.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books/{author}/{title}")
    public List<Book> findByAuthorAndTitle(@PathVariable("author") String author,
                                                   @PathVariable("title") String title) {
        return bookRepository.findBooksByAuthorNameAndTitle(author, title);
    }
}
