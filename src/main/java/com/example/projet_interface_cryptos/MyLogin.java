package com.example.projet_interface_cryptos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MyLogin extends Application {
    private static Stage primaryStage;
    public static void changeScene(Scene scene, String title){
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
    }
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Wallet.class.getResource("Mylogin.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("login");
        stage.setScene(scene);
        SceneManager.setCurrenStage(stage);
        stage.show();
        //scene.getStylesheets().add(MyLogin.class.getResource("MyLogin.css").toExternalForm());
    }

    public static void main(String[] args) {
        launch();
    }

}