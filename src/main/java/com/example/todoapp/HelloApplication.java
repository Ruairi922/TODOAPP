package com.example.todoapp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        root.setStyle("-fx-background-color: lightblue;"); // Use your desired color
        Scene scene = new Scene(root, 800, 500);
        root.setStyle("-fx-background-color: lightblue;"); // Use your desired color
        primaryStage.setScene(scene);
        primaryStage.setTitle("To-Do App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
