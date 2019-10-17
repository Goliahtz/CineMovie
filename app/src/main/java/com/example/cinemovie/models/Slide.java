package com.example.cinemovie.models;

public class Slide {

    private int image;
    private String Title;
    // Add more field depand what u want ^-^

    public Slide(int image, String title) {
        this.image = image;
        Title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


}
