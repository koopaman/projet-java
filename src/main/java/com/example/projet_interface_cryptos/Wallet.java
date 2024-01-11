package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Wallet extends Application {

    private String nom;
    private List<Bienfinancier> bienfinanciers;

    public void stocker() {
        // Implémentation de la méthode stocker
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
