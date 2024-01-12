package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class welcomeController {


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    private Label prout;

    @FXML
    protected void onCickme() {
        prout.setText("laaaa");
    }

    @FXML
    protected void setButton1(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/MyLogin.fxml", "actifs");
    }
    @FXML
    protected void buttonbancaire(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte argent.fxml", "actifs");
    }
    @FXML
    protected void buttoncrypto(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte crypto.fxml", "actifs");
    }
    @FXML
    protected void buttonaction(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte actions.fxml", "actifs");
    }

}