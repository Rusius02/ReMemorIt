package com.example.controller;

import com.example.dtos.input.BookInputDto;
import com.example.dtos.output.BookOutputDto;
import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("getBook")
    public BookOutputDto getBook(@RequestBody long id){
        BookOutputDto bookOutputDto = bookService.getBook(id);
        return bookOutputDto;
    }
    @PostMapping("create")
    public BookOutputDto createBook(@RequestBody BookInputDto bookInputDto){
        BookOutputDto bookOutputDto = bookService.createBook(bookInputDto);
        return bookOutputDto;
    }
    @PostMapping("delete")
    public void createBook(@RequestBody Long id){
        bookService.delete(id);
    }
}
