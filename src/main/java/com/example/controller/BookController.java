package com.example.controller;

import com.example.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/book")
public class BookController {

    @GetMapping("getBook")
    public Book getBook(@RequestBody long id){
        Book book = new Book();
        return book;
    }
}
