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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public int getNumberOfCryptos() {
        return numberOfCryptos;
    }

    public void setNumberOfCryptos(int numberOfCryptos) {
        this.numberOfCryptos = numberOfCryptos;
    }

    public int getNumberOfActions() {
        return numberOfActions;
    }

    public void setNumberOfActions(int numberOfActions) {
        this.numberOfActions = numberOfActions;
    }
}




