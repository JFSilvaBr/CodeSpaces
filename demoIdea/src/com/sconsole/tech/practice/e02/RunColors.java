package com.sconsole.tech.practice.e02;

import javafx.application.Application;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.scene.paint.Color;
        import javafx.scene.paint.CycleMethod;
        import javafx.scene.paint.LinearGradient;
        import javafx.scene.paint.Stop;
        import javafx.scene.shape.Polygon;
        import javafx.scene.shape.Rectangle;
        import javafx.stage.Stage;

public class RunColors extends Application {

    @Override
    public void start(Stage primeiraStage) throws Exception {
        Group root = new Group();
        //Aqui vou adicionar os componentes
        Rectangle rect = new Rectangle(20,20,200,100);
        //Preenchendo com a cor branca          //X  Y  X  Y  propr
        LinearGradient grad1 = new LinearGradient(0, 0, 1, 1, true,
                CycleMethod.NO_CYCLE, new Stop[]{
                new Stop(0,Color.DODGERBLUE),
                new Stop(1,Color.WHITE),
        });
        rect.setFill(grad1);

        Polygon star = new Polygon(
                300,200,
                275,250,
                225,250,
                250,300, //
                225,350,
                275,350,
                300,400,
                325,350,
                375,350,
                350,300, //
                375,250,
                325,250

        );

        Polygon triangulo = new Polygon(
                700, 200,
                450, 450,
                700, 450
        );

        LinearGradient grad2 = new LinearGradient(0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE, new Stop[] {
                new Stop(0,Color.AQUA),
                new Stop(0.5,Color.YELLOW),
                new Stop(1,Color.RED)
        });

        LinearGradient jTheme = new LinearGradient(0, 0, 1, 1, true,
                CycleMethod.NO_CYCLE, new Stop[] {
                new Stop(1,Color.web("#006699")),
                new Stop(1,Color.web("00bbcc"))
        });

        triangulo.setFill(jTheme);
        star.setFill(Color.web("#f9f9f9"));
        //Adiocionando o item ao nó root
        root.getChildren().addAll(rect, star, triangulo);
        //Criando a scene
        Scene scene = new Scene(root,800,600,Color.web("#37474F"));

        primeiraStage.setTitle("Demonstração de cores e formas");
        primeiraStage.setScene(scene);
        primeiraStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}