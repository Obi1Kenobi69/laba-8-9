package com.example.laba333;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lbl = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        Button btn = new Button("Click");
        btn.setOnAction(event->lbl.setText("Input:"+ textField.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,textField,btn,lbl);
        Scene scene = new Scene(root,250,200);
        stage.setScene(scene);
        stage.setTitle("TextField in JavaFX");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}