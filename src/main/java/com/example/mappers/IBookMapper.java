package com.example.mappers;

import com.example.dtos.input.BookInputDto;
import com.example.dtos.output.BookOutputDto;
import com.example.model.Book;
import org.mapstruct.Mapper;

@Mapper
public interface IBookMapper {
    Book BookDTOToBook(BookInputDto bookInputDto);
    BookOutputDto BookInputDtoToBookOutputDto(BookInputDto bookInputDto);
    BookOutputDto BookToBookOutputDto(Book book);
}
