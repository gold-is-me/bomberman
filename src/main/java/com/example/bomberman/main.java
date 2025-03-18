package com.example.bomberman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Pane;
import com.example.bomberman.affichage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Créer un conteneur racine
        Pane root = new Pane();

        // Créer une instance de la classe affichage
        affichage affichage = new affichage();

        // Configurer et afficher une image
        affichage.afficher(64, 64, 10, 500, "C:\\Users\\d.dilillo\\IdeaProjects\\java\\bomberman\\src\\main\\resources\\com\\example\\bomberman\\Bomberman Enemies  Miscellaneous.png");

        // Ajouter l'imageView au conteneur racine
        root.getChildren().add(affichage.getImageView());


        // Créer une scène et l'ajouter à la fenêtre principale
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("BOMBERMAN");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}