package com.sconsole.academy.practice.e03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Run extends Application {

    @Override
    public void start(Stage primeiraStage) throws Exception {
        Main main = new Main();

        Scene scene = new Scene(main,800,600,Color.AZURE);

        primeiraStage.setTitle("Exemplo de troca de telas");
        primeiraStage.setScene(scene);
        primeiraStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}