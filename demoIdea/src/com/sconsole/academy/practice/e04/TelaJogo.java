package com.sconsole.academy.practice.e04;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class TelaJogo extends Group {


    public TelaJogo(){
        ImagemDuke img01 = new ImagemDuke();
        ImagemDuke img02 = new ImagemDuke();
        ImagemDuke img03 = new ImagemDuke();

        img01.setLayoutX(100); img01.setLayoutY(100);
        img02.setLayoutX(100); img02.setLayoutY(200);
        img03.setLayoutX(100); img03.setLayoutY(300);

        this.getChildren().addAll(img01,img02,img03);
        scena = new Scene(this, 800,600, Color.web("#C3C3C3"));
    }


    private final Scene scena;

    public Scene getScena() {
        return scena;
    }
}
