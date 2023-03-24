package com.example.demo2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextF extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        TextField textField = new TextField();
        Text text = new Text();
        textField.setLayoutX(20);
        textField.setLayoutY(20);
        text.setLayoutX(20);
        text.setLayoutY(60);
        pane.getChildren().addAll(textField, text);

        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                text.setText(textField.getText());
            }
        });

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
