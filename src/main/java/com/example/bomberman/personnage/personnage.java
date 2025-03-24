package com.example.bomberman.personnage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class personnage {
    private double x, y, vitesse = 8;
    private final ImageView imageView;
    private boolean move_right, move_left, move_up, move_down = false;

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
//        System.out.println("x: " + x + " y: " + y);
    }
    public void move() {
        if (move_right) {
            this.x += vitesse;
        }
        if (move_left) {
            this.x -= vitesse;
        }
        if (move_up) {
            this.y -= vitesse;
        }
        if (move_down) {
            this.y += vitesse;
        }
        imageView.setX(x);
        imageView.setY(y);
//        System.out.println("x: " + x + " y: " + y);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void mettreAJour() {
        // Met à jour la logique du joueur (si besoin)
    }
    public void moveRight() {
        this.move_right = true;
    }
    public void moveLeft() {
        move_left = true;
    }
    public void moveUp() {
        move_up = true;
    }
    public void moveDown() {
        move_down = true;
    }
    public void stopMovingRight() {
        this.move_right = false;
    }
    public void stopMovingLeft() {
        move_left = false;
    }
    public void stopMovingUp() {
        move_up = false;
    }
    public void stopMovingDown() {
        move_down = false;
    }
}