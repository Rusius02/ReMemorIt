package com.example.model;

import lombok.Data;

import java.util.List;

@Data
public class Serie extends Entity{
    private List<Season> seasons;
    private List<Actor> actors;
}
