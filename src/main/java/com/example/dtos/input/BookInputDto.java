package com.example.dtos.input;

import com.example.model.Genre;
import lombok.Data;

@Data
public class BookInputDto extends EntityInputDto {
    private String author;
    private String edition;
    private String collection;
    private Genre genre;
}
