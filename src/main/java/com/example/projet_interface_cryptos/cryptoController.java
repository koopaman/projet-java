package com.example.projet_interface_cryptos;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class cryptoController {
    @FXML
    protected void retourcrypto(ActionEvent e){
        SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");
    }
}
