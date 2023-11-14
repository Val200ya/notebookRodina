package com.example.notebookrodina;

import data.Users;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class NotebookController implements Initializable {
    @FXML
    private Label nameLabel;
    @FXML
    private ListView<String> notesListView;
    @FXML
    private TextField noteTextField;
    ObservableList<String> notes = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Users users = new Users();
        nameLabel.setText(Users.users.get(0).getName());
    }

    public void addButtonClick(ActionEvent actionEvent) {
        notes.add(noteTextField.getText());
        notesListView.setItems(notes);
    }

    public void deleteButtonClick(ActionEvent actionEvent) {
        notes.remove(notes.size() - 1);
    }
}
