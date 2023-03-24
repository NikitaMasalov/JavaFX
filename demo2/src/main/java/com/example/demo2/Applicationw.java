package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Applicationw extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setFill(Color.CORAL);
        circle.setStroke(Color.ORANGERED);
        circle.setStrokeWidth(5);

        Text text = new Text("Hi");
        text.setFill(Color.DARKVIOLET);
        Font font = Font.font("Times New Roman", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 35);
        text.setFont(font);
        //text.setStyle("-fx-fill: red, -fx-font-weight: bold, -fx-font-size: 22" );

        Rectangle rectangle = new Rectangle(100, 100, 100, 100);
        rectangle.setFill(Color.GOLD);

        BorderPane pane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);
        pane.setLeft(stackPane);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}