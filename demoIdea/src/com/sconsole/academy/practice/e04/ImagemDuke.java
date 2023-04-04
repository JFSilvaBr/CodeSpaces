package com.sconsole.academy.practice.e04;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;


public class ImagemDuke extends Group {
    private ImageView imagemDukeView;
    private Image imagemDuke;
    private ImageView imagemLuvaView;
    private Image imagemLuva;
    private AudioClip audio;

    public ImagemDuke(){
        imagemDuke = new Image (getClass().getResource("Images/Duke.png").toString());
        imagemDukeView = new ImageView(imagemDuke);

        imagemLuva = new Image(getClass().getResource("Images/Glove.png").toString());
        imagemLuvaView = new ImageView(imagemLuva);

        audio = new AudioClip (getClass().getResource("Audios/Note5.wav").toString());


        // add position
        imagemDukeView.setX(0);
        imagemDukeView.setY(11);

        imagemLuvaView.setPreserveRatio(true);
        imagemLuvaView.setFitHeight(35);
        imagemLuvaView.setX(13);
        imagemLuvaView.setY(0);

        imagemLuvaView.toFront();

        this.getChildren().addAll(imagemDukeView, imagemLuvaView);
        // Add events
        adicionarEventos();
    }
    private void adicionarEventos(){
        this.setOnMouseClicked((evt)->{
            audio.play();
        });

        this.setOnMouseDragged((evt)->{
            System.out.println(evt.getSceneX() + ";" + evt.getScreenX());
        });
    }

}
