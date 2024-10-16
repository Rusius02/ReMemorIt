package com.example.model;

import lombok.Data;

@Data
public class Book extends Entity{
    private int nbPage;
    private String author;
    private String edition;
    private String collection;
    private Genre genre;
}
