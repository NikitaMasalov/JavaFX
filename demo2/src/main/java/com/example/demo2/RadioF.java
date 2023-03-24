package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioF extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text();
        RadioButton radioButton = new RadioButton("Привет");
        RadioButton radioButton1 = new RadioButton("пока");
        pane.getChildren().addAll(radioButton, radioButton1, text);
        radioButton.setLayoutX(20);
        radioButton.setLayoutY(20);
        radioButton1.setLayoutX(20);
        radioButton1.setLayoutY(40);
        text.setX(20);
        text.setY(80);

        ToggleGroup group = new ToggleGroup();
        radioButton.setToggleGroup(group);
        radioButton1.setToggleGroup(group);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (radioButton.isSelected())
                    text.setText("Вы поздаровались");
                else if (radioButton1.isSelected())
                    text.setText("Вы попрощались");
                else text.setText("что то выберите!!!");
            }
        };
        radioButton.setOnAction(handler);
        radioButton1.setOnAction(handler);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
