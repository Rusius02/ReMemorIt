package com.example.dtos;

import com.example.model.Genre;
import lombok.Data;

@Data
public class BookOutputDto extends EntityOutputDto{
    private int nbPage;
    private String author;
    private String edition;
    private String collection;
    private Genre genre;
}
