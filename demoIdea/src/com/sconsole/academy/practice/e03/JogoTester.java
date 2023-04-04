package com.sconsole.academy.practice.e03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JogoTester extends Application {

    @Override
    public void start(Stage primeiraStage) throws Exception {
        TelaPrincipal telaprincipal = new TelaPrincipal();
        TelaJogo telaJogo = new TelaJogo();

        ControladorScena controle = new ControladorScena();
        controle.adicionarScene("TelaPrincipal", telaprincipal.getScena());
        controle.adicionarScene("TelaJogo", telaJogo.getScena());
        telaprincipal.setControle(controle);
        telaJogo.setControle(controle);


        Scene scene = telaprincipal.getScena();
        primeiraStage.setTitle("Exemplo de troca de telas");
        primeiraStage.setScene(scene);
        primeiraStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}