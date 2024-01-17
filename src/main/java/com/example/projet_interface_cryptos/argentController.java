package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.json.JSONObject;

public class argentController {
    @FXML
    public Label argentici;
    @FXML
    protected void retourargent(ActionEvent e){
        SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");
    }

    public void showargent() {
        argentici.setText(" poyohermano a un solde de 20000 dollars ");
    }
}
