package com.example.service;

import com.example.dtos.input.BookInputDto;
import com.example.dtos.output.BookOutputDto;
import com.example.mappers.IBookMapper;
import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private IBookRepository bookRepository;
    @Autowired
    private IBookMapper bookMapper;
    public BookOutputDto createBook(BookInputDto bookInputDto){
        Book book = bookMapper.BookDTOToBook(bookInputDto);
        return bookMapper.BookToBookOutputDto(bookRepository.save(book));
    }
}
