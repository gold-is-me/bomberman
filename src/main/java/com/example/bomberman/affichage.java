package com.example.bomberman;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class affichage {
    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private Image image; // L'image associée à l'item
    private ImageView imageView;

    public void afficher(int width, int height,int positionX, int positionY, String imagePath){
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;

        // Charger l'image à partir du chemin
        this.image = new Image(imagePath);
        this.imageView = new ImageView(this.image);

        // Configurer les dimensions et la position
        this.imageView.setFitWidth(width);
        this.imageView.setFitHeight(height);
        this.imageView.setX(positionX);
        this.imageView.setY(positionY);
    }
    public ImageView getImageView(){
        return imageView;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setPositionX(int positionX){
        this.positionX = positionX;
    }
    public void setPositionY(int positionY){
        this.positionY = positionY;
    }



}
