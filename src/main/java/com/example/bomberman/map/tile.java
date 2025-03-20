package com.example.bomberman.map;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class tile {
    private final int x;
    private final int y;
    private final ImageView imageView;

    public tile(String spritePath, int x, int y) {
        this.x = x;
        this.y = y;
        Image image = new Image(spritePath);
        this.imageView = new ImageView(image);
        this.imageView.setFitWidth(32);
        this.imageView.setFitHeight(32);
        this.imageView.setX(x);
        this.imageView.setY(y);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
