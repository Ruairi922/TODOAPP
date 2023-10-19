package com.example.todoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController  {

    @FXML
    private ListView<String> todoListView;

    @FXML
    private TextField taskTextField;



    public void addTask() {
        String task = taskTextField.getText();
        if (!task.isEmpty()) {
            todoListView.getItems().add(task);
            taskTextField.clear();
        }
    }

    public void removeTask() {
        int selectedIdx = todoListView.getSelectionModel().getSelectedIndex();
        if (selectedIdx >= 0) {
            todoListView.getItems().remove(selectedIdx);
        }
    }
}