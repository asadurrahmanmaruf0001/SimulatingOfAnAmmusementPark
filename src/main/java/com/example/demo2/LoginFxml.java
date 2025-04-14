package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFxml
{
    @javafx.fxml.FXML
    private CheckBox showPasswordCheckBox;
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private Label showPasswordLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void continueButtonOnAction(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(LoginFxml.class.getResource("createAccountFxml.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage= new Stage();
//        stage.setTitle("Create Account!");
//        stage.setScene(scene);
//        stage.show();


        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createAccountFxml.fxml"));
        root= fxmlLoader.load();
        Scene scene= new Scene(root);
        Stage stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();


    }
}