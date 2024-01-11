package com.example.projet_interface_cryptos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.IOException;

public class WelcomePageController extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("accueil");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelcomePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
