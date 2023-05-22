package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import java.io.Serializable;

public class Product implements Serializable {

    private String name, title, color, description, sum;
    int image;

    public Product(String name, String title, String color, String description, String sum, int imag) {
        this.name = name;
        this.title = title;
        this.color = color;
        this.description = description;
        this.sum = sum;
        this.image = imag;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String getSum() {
        return sum;
    }

    public int getImage() {
        return image;
    }
}

