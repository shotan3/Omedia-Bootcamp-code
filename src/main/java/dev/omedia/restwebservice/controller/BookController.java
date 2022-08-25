package dev.omedia.restwebservice.controller;

import dev.omedia.restwebservice.model.book.Book;
import dev.omedia.restwebservice.repo.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/book")
    void post(@RequestBody Book book){
        bookRepository.save(book);
    }
}
