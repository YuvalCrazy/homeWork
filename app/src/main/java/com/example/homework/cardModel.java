package com.example.homework;

public class cardModel {

    int image;
    String name;

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public cardModel(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
