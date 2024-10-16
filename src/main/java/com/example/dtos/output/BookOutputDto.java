package com.example.dtos.output;

import com.example.model.Genre;
import lombok.Data;

@Data
public class BookOutputDto extends EntityOutputDto {
    private int nbPage;
    private String author;
    private String edition;
    private String collection;
    private Genre genre;
}
