package com.example.projet_interface_cryptos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.projet_interface_cryptos.MyLogin.changeScene;

public class ByeController {
    @FXML
    private Label byeLabel;
    @FXML
    protected void onByeButtonClick() throws IOException {
        byeLabel.setText("Goodbyee then");
    }
    public static void goToBye(Entity entity) {
        try {
            FXMLLoader fxmlLoader = new
                    FXMLLoader(HelloApplication.class.getResource("WelcomePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            String hello = "Hello, " + entity.getEmail() + " " + "!";
            ByeController c = fxmlLoader.getController();
            c.byeLabel.setText(hello);
            changeScene(scene,"Bye");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}