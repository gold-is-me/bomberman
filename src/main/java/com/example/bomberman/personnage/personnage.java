package com.example.bomberman.personnage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class personnage {
    private double x, y, vitesse = 64;
    private final ImageView imageView;

    public personnage(String spritePath, int largeur, int hauteur) {
        Image image = new Image(spritePath);
        imageView = new ImageView(image);
        imageView.setFitWidth(largeur);
        imageView.setFitHeight(hauteur);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getVitesse() {
        return vitesse;
    }
    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        imageView.setX(x);
        imageView.setY(y);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void mettreAJour() {
        // Met à jour la logique du joueur (si besoin)
    }
}