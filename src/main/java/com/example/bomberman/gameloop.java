package com.example.bomberman;

import javafx.animation.AnimationTimer;
import com.example.bomberman.personnage.personnage;

public class gameloop extends AnimationTimer {
    private final personnage joueur;

    public gameloop(personnage joueur) {
        this.joueur = joueur;
    }

    @Override
    public void handle(long now) {
        // Mettre à jour les animations et la logique des entités
        joueur.mettreAJour();
        // On pourrait aussi mettre à jour les ennemis et les bombes ici
    }
}