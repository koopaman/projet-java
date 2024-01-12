package com.example.projet_interface_cryptos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class argent extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Wallet.class.getResource("compte argent.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("portefeuilles");
        stage.setScene(scene);
        SceneManager.setCurrenStage(stage);
        stage.show();
        stage.centerOnScreen();
        // modif
    }
}
