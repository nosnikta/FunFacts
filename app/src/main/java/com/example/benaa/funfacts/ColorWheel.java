package com.example.benaa.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] colors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#7d669e",
            "#e0ab18",
            "#b7c0c7"};

    int getColor() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
