package com.example.laba87;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<String>langs = FXCollections.observableArrayList("Java","JavaScript","C#","Python");
        ListView<String>langsListView = new ListView<String>(langs);
        FlowPane root = new FlowPane(langsListView);
        Scene scene = new Scene(root,250,200);
        stage.setScene(scene);
        stage.setTitle("ListView in JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}