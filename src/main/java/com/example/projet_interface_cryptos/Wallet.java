package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.List;

public class Wallet extends Application {


    private Object Wallet;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Wallet.class.getResource("Welcomepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
        SceneManager.setCurrenStage(stage);
        stage.show();
        stage.centerOnScreen();
    }
    private double balance;
    private int numberOfCoins;
    private int numberOfCryptos;
    private int numberOfActions;

    public void setWallet(Wallet wallet) {
        this.Wallet = Wallet;
    }
}


