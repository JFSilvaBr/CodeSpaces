package com.sconsole.academy.practice.e03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaJogo extends VBox {
    private Button btnTelaPrincipal;
    private Button btnSair;

    private ControladorScena controle;

    private Scene scena;

    public TelaJogo() {
        btnTelaPrincipal = new Button("Tela Principal");
        btnSair = new Button("Sair");

//Criando o evento do botão para a tela principal
        btnTelaPrincipal.prefWidthProperty().bind(this.widthProperty());
        btnTelaPrincipal.setOnAction((evt)->{
            Node no = (Node) evt.getSource();
            Stage janela = (Stage) no.getScene().getWindow();
            Scene scenaPrincipal = controle.buscarScene("TelaPrincipal");
            janela.setScene(scenaPrincipal);
        });
//Colocando os eventos
        btnSair.setOnAction((evt)->{
            Node no = (Node)evt.getSource();
            Stage janela = (Stage)no.getScene().getWindow();
            janela.close();
        });

//Colocando os botões para se auto-dimensionar
        btnTelaPrincipal.prefWidthProperty().bind(this.widthProperty());
        btnSair.prefWidthProperty().bind(this.widthProperty());
//Dando espaço entre os componentes
        this.setSpacing(10);
        this.setStyle("-fx-background-color: rgba(255,255,255,0);");//Fundo transparente
        this.setPadding(new Insets(10));//Espaço nas bordas internas
        this.setAlignment(Pos.CENTER);//Alinhamento
        this.getChildren().addAll(btnTelaPrincipal,btnSair);
//Criando a cena principal
        scena = new Scene(this,800,600,Color.ANTIQUEWHITE);

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
