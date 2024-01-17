package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.List;

public class Wallet extends Application {


    private Object Wallet;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Wallet.class.getResource("Welcomepage.fxml"));
        double width = Screen.getPrimary().getBounds().getWidth();
        double height = Screen.getPrimary().getBounds().getHeight();
        double appWidth = width * .70;
        double appHeight = height * .80;
        Parent wallet = (new Scene(fxmlLoader.load(), appWidth, appHeight * .5)).getRoot();
        VBox vBox = new VBox();
        vBox.getChildren().add(wallet);
        ListView<String> symbolListView = new ListView<>();
        List<String> symbols = CryptoApp.getCryptoSymbolsFromCSV();
        int maxSymbols = Math.min(symbols.size(), 100);
        symbolListView.getItems().addAll(symbols.subList(0, maxSymbols));
        // VBox root = new VBox(symbolListView);
        vBox.getChildren().add(symbolListView);
        SceneManager.setCurrenStage(stage);
        stage.show();
        stage.centerOnScreen();
        Scene scene = new Scene(vBox, appWidth, appHeight);
        stage.setScene(scene);
        stage.show();
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




