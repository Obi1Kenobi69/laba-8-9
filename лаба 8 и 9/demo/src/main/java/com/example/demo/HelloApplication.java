package com.example.demo;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.Flow;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField textField = new TextField();
        ObservableList<String>langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ListView<String>langsListView=new ListView<String>(langs);
        langsListView.setPrefSize(250,150);
        Button addBtn = new Button("Add");
        Button deleteBtn = new Button("Delete");
        FlowPane buttonPane = new FlowPane(10,10,textField,addBtn,deleteBtn);
        addBtn.setOnAction(event->langs.add(textField.getText()));
        deleteBtn.setOnAction(event-> langs.remove(textField.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,buttonPane,langsListView);
        Scene scene = new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("ListView in JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}