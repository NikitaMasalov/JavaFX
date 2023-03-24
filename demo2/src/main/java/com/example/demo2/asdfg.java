package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class asdfg extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text();
        CheckBox checkBox1 = new CheckBox("Yes");
        CheckBox checkBox2 = new CheckBox("No");
        pane.getChildren().addAll(checkBox1, checkBox2, text);
        checkBox1.setLayoutX(20);
        checkBox1.setLayoutY(20);
        checkBox2.setLayoutX(40);
        checkBox2.setLayoutY(40);
        text.setX(20);
        text.setY(80);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (checkBox1.isSelected() && !checkBox2.isSelected())
                    text.setText("да вы нажали да");
                else if (checkBox1.isSelected() && checkBox2.isSelected())
                    text.setText("да или нет?");
                else if (!checkBox1.isSelected() && checkBox2.isSelected())
                    text.setText("Нет вы нажали нет");
                else text.setText("Вы ничего не выбрали");
            }
        };
        checkBox1.setOnAction(handler);
        checkBox1.setOnAction(handler);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
