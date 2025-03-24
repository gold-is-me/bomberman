package com.example.bomberman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import com.example.bomberman.personnage.personnage;
import com.example.bomberman.map.map;

public class main extends Application {
    private personnage joueur;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);
        map map = new map(20, 13, root);


        // Initialisation des entités
        joueur = new personnage("C:\\Users\\d.dilillo\\IdeaProjects\\java\\bomberman\\src\\main\\resources\\com\\example\\bomberman\\Bomberman Enemies  Miscellaneous.png", 32, 32);
        root.getChildren().add(joueur.getImageView());


//        // Attacher les contrôles du joueur
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP -> joueur.moveUp();
                case DOWN -> joueur.moveDown();
                case LEFT -> joueur.moveLeft();
                case RIGHT -> joueur.moveRight();
            }
        });

        scene.setOnKeyReleased(event -> {
            switch (event.getCode()) {
                case UP -> joueur.stopMovingUp();
                case DOWN -> joueur.stopMovingDown();
                case LEFT -> joueur.stopMovingLeft();
                case RIGHT -> joueur.stopMovingRight();
            }
        });

        // Lancer la boucle du jeu
        gameloop gameloop = new gameloop(joueur);
        gameloop.start();

        stage.setTitle("Bomberman");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}