package com.example.bomberman.map;


import javafx.scene.layout.Pane;

public class map {
    private final int rows;
    private final int cols;
    private final tile[][] tiles;

    public map(int rows, int cols, Pane root) {
        this.rows = rows;
        this.cols = cols;
        tiles = new tile[rows][cols];

        // Remplir la carte avec des tiles
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Exemple : Une image de sol ou un sprite générique
                tile tile = new tile("C:\\Users\\d.dilillo\\IdeaProjects\\java\\bomberman\\src\\main\\resources\\com\\example\\bomberman\\herbe.png", j * 32, i * 32);
                tiles[i][j] = tile;
                root.getChildren().add(tile.getImageView()); // Ajouter la tile au panneau
            }
        }
    }

    public tile gettile(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return null; // Éviter les dépassements
        }
        return tiles[row][col];
    }
}
