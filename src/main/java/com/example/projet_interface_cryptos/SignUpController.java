package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SignUpController {
    @FXML
    protected void signuptologin(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/MyLogin.fxml", "login");

    }
}
