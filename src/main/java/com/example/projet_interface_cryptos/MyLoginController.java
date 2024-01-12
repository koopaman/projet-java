package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MyLoginController {
    @FXML
    private TextField username;
    @FXML
    public  PasswordField password;
    @FXML
    public  Label  title;
    @FXML
    private Label submission;

    @FXML
    protected void onHelloButtonClick(ActionEvent e){
        String emailText = username.getText();
        String passwordText = password.getText();
        SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");
    }

}

