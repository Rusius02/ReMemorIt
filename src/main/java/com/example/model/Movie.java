package com.example.model;

import lombok.Data;

import java.util.List;

@Data
public class Movie extends Entity{
    private int duration;
    private List<Actor> actors;
    private Genre genre;
}
