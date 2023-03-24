package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Da extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        HBox pane = new HBox();

        Circle circle = new Circle(50);
        circle.setFill(Color.CORAL);
        circle.setStroke(Color.ORANGERED);
        circle.setStrokeWidth(5);

        Label label = new Label("Bue", circle);
        label.setContentDisplay(ContentDisplay.CENTER);

        pane.getChildren().add(label);

        Rectangle rectangle = new Rectangle(100, 100, 100, 100);
        Label label1 = new Label("Lage", rectangle);
        pane.getChildren().add(label1);
        label1.setContentDisplay(ContentDisplay.TOP);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
