package com.example.projet_interface_cryptos;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SceneManager {

    public static Stage currenStage;

    static public void changeScene(String FXMLFileName, String titre){
        try {
            FXMLLoader fxmlLoader= new FXMLLoader(SceneManager.class.getResource(FXMLFileName));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = new Stage();
            stage.setTitle(titre);
            stage.setScene(scene);

            currenStage.close();
            currenStage =stage;
            currenStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Stage getCurrenStage() {
        return currenStage;
    }

    public static void setCurrenStage(Stage currenStage) {
        SceneManager.currenStage = currenStage;
    }

}
