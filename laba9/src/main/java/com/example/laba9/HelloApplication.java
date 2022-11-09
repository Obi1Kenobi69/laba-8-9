package com.example.laba9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn = new Button("Hello");
        BorderPane root = new BorderPane(btn);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("BorderPane in JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}