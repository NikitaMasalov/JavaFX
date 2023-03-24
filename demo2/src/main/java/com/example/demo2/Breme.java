package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.Callable;

public class Breme extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.setCenterY(100);
        circle.setCenterX(100);
        circle.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                circle.setCenterX(mouseEvent.getX());
                circle.setCenterY(mouseEvent.getY());
            }
        });
        Color color = new Color(0.5, 0.3, 0.9, 1.0);
        circle.setFill(color);

        Text text = new Text("Хаю хай");
        text.setX(200);
        text.setY(200);
        Color color1 = new Color(0.3, 0,0.1, 0.9);
        text.setFill(color1);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setX(mouseEvent.getX());
                text.setY(mouseEvent.getY());
            }
        });
        Font font = Font.font("Times New Roman", FontWeight.THIN, FontPosture.REGULAR, 35);
        text.setFont(font);

        Circle circle1 = new Circle(60);
        circle1.setFill(Color.CORAL);
        circle1.setCenterX(100);
        circle1.setCenterY(100);


        Rectangle rectangle = new Rectangle(100, 100, 100, 100);
        rectangle.setFill(Color.ORANGERED);

        Button button = new Button("Нажми и что то будет");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (rectangle.getX() == 0) rectangle.setX(400);
                else rectangle.setX(rectangle.getX() - 10);

                if (circle1.getCenterY() == 0) circle1.setCenterY(400);
                else circle1.setCenterY(circle1.getCenterY() - 10);
            }
        });

        pane.getChildren().add(circle1);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(button);
        pane.getChildren().add(circle);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
