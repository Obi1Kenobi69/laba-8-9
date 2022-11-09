package com.example.laba22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lbl = new Label();
        TextArea textArea  = new TextArea();
        textArea.setPrefColumnCount(15);
        textArea.setPrefRowCount(5);
        Button btn = new Button("Click");
        btn.setOnAction(event->lbl.setText("Input:"+textArea.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,textArea,btn,lbl);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("TextArea in JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}