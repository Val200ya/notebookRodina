package com.example.notebookrodina;

import data.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField numberTextField;
    @FXML
    public void notebookButtonClick(ActionEvent actionEvent) throws IOException {
        if (checkNumber()) {
            showNotebookView();

        } else {
            System.out.println("Неверный номер телефона.");
        }
    }

    private void showNotebookView() throws IOException{
        Stage notebookStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        notebookStage.setTitle("Записная книжка");
        notebookStage.setScene(scene);
        notebookStage.show();
    }

    public boolean checkNumber() {
        Users users = new Users();
        if (numberTextField.getText().equals(Users.users.get(0).getNumber())) {
            return true;
        }
        return false;
    }
}