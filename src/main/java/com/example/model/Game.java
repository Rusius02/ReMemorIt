package com.example.model;

import lombok.Data;

@Data
public class Game extends Entity{
    private int ageLimit;
    private int minAge;
    private int maxAge;
}
