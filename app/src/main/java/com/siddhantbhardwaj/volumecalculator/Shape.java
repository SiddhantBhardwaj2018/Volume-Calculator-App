package com.siddhantbhardwaj.volumecalculator;

public class Shape {

    private int shapeImg;

    private String shapeName;

    public Shape(int image, String text) {
        this.shapeImg = image;
        this.shapeName = text;
    }

    public int getImage() {
        return shapeImg;
    }

    public void setImage(int image) {
        this.shapeImg = image;
    }

    public String getText() {
        return shapeName;
    }

    public void setText(String text) {
        this.shapeName = text;
    }
}
