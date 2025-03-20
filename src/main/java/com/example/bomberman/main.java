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

        map map = new map(10, 13, root);


        // Initialisation des entités
        joueur = new personnage("C:\\Users\\d.dilillo\\IdeaProjects\\java\\bomberman\\src\\main\\resources\\com\\example\\bomberman\\Bomberman Enemies  Miscellaneous.png", 64, 64);
        root.getChildren().add(joueur.getImageView());


        // Attacher les contrôles du joueur
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP -> joueur.move(0,-joueur.getVitesse());
                case DOWN -> joueur.move(0,joueur.getVitesse());
                case LEFT -> joueur.move(-joueur.getVitesse(), 0);
                case RIGHT -> joueur.move(joueur.getVitesse(), 0);
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