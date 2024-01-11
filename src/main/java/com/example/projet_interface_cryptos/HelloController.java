package com.example.projet_interface_cryptos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {


    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    @FXML
    private Label prout;
    @FXML
    protected void onCickme() {prout.setText("laaaa");}

    @FXML
    private Label button1;
    @FXML
    protected void setButton1() {button1.setText("chargement");}
}