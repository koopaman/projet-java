package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CryptoApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        ListView<String> symbolListView = new ListView<>();

        List<String> symbols = getCryptoSymbolsFromCSV();

        int maxSymbols = Math.min(symbols.size(), 100);
        symbolListView.getItems().addAll(symbols.subList(0, maxSymbols));

        VBox root = new VBox(symbolListView);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Liste des Cryptos/Actions");
        primaryStage.setScene(scene);

        // Affiche la scène principale
        primaryStage.show();
    }

    public static List<String> getCryptoSymbolsFromCSV() {
        List<String> symbols = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("listing_status.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {

                symbols.add(nextLine[0] + " - " + nextLine[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return symbols;
    }

    public static void main(String[] args) {
        launch(args);
    }
}


