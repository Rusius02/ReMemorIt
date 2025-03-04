package com.example.service;

import com.example.dtos.input.BookInputDto;
import com.example.dtos.output.BookOutputDto;
import com.example.mappers.IBookMapper;
import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public BookOutputDto getBook(Long id) {
        return bookRepository.findById(id)
                .map(bookMapper::BookToBookOutputDto)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }
    public List<BookOutputDto> getBooks() {
        return bookRepository.findAll().stream().map(bookMapper::BookToBookOutputDto).toList();
    }
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
