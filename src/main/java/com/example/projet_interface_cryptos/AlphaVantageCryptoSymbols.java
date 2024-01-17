package com.example.projet_interface_cryptos;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AlphaVantageCryptoSymbols {
    public static void main(String[] args) {
        List<String[]> symbols = getCryptoAndStockSymbols();

        System.out.println("Liste des symboles d'actions/cryptos :");
        symbols.forEach(symbol -> System.out.println("Nom : " + symbol[0] + ", Symbole : " + symbol[1]));
    }

    static List<String[]> getCryptoAndStockSymbols() {
        List<String[]> symbols = new ArrayList<>();

        try {

            String csvFile = "listing_status.csv";
            CSVReader reader = new CSVReader(new FileReader(csvFile));

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {

                if (nextLine.length >= 2) {
                    String[] symbol = {nextLine[0], nextLine[1]};
                    symbols.add(symbol);
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return symbols;
    }
}