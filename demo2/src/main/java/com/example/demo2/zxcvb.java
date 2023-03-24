package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class zxcvb extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane pane = new BorderPane();
        TextArea textArea = new TextArea();
        ScrollPane scrollPane = new ScrollPane();
        //Image image = new Image(new FileInputStream("scr/Flaf.jpg"));
        //ImageView imageView = new ImageView(image);
        Label l1 = new Label();
        l1.setContentDisplay(ContentDisplay.TOP);

        pane.setLeft(l1);
        pane.setCenter(textArea);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}