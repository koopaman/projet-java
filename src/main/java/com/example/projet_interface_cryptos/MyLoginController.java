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
    private Label loginmessagelabel;



    @FXML
    protected void onHelloButtonClick(ActionEvent e){
        if (username.getText().isBlank() && password.getText().isBlank()){
            loginmessagelabel.setText("svp entrez des coordonnées valides");

        }
        else {
            SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");
        }
    }


    @FXML
    protected void logintosignup(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/SignUp.fxml", "login");

    }

}

