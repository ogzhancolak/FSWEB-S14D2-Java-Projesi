package com.workintech.composition.model;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create() {
        System.out.println("Height: " + height);
        System.out.println("Paint Color: " + color);
    }
}
