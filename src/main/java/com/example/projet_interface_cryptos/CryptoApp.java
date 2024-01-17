package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class CryptoApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        ListView<String> symbolListView = new ListView<>();

        List<String[]> symbols = AlphaVantageCryptoSymbols.getCryptoAndStockSymbols();

        symbolListView.getItems().addAll(String.valueOf(symbols));

        VBox root = new VBox(symbolListView);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Liste des Cryptos/Actions");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

