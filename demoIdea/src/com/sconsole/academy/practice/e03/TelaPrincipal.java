package com.sconsole.academy.practice.e03;
import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.Node;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.VBox;

import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class TelaPrincipal extends VBox {

    private Button btnJogo;

    private Button btnSair;

    private Scene scena;

    private ControladorScena controle;

    public TelaPrincipal() {

        btnJogo = new Button("Chamar o Jogo");

        btnSair = new Button("Terminar");

//Metodos dos botoes

        btnSair.setOnAction((evt)->{

            Node no = (Node)evt.getSource();

            Stage janela = (Stage)no.getScene().getWindow();

            janela.close();

        });

//Evento do botao para chamar o jogo

        btnJogo.setOnAction((evt)->{

            Node no = (Node) evt.getSource();

            Stage janela = (Stage) no.getScene().getWindow();

            Scene scenaJogo = controle.buscarScene("TelaJogo");

            janela.setScene(scenaJogo);

        });

//Tirando a cor de fundo

        this.setStyle("-fx-background-color: rgba(255,255,255,0);");

//Amarrando a propriedade de comprimento da box ao tamanho dos botões

        btnJogo.prefWidthProperty().bind(this.widthProperty());

        btnSair.prefWidthProperty().bind(this.widthProperty());

        this.setSpacing(10);

        this.setAlignment(Pos.CENTER);

        this.setPadding(new Insets(10));//Espaçamento interno para nao ficar colado no box

        this.getChildren().addAll(btnJogo,btnSair);

        scena = new Scene(this,800,600,Color.AQUA);

    }

    public Scene getScena() {

        return scena;

    }

    public ControladorScena getControle() {

        return controle;

    }

    public void setControle(ControladorScena controle) {

        this.controle = controle;

    }

}