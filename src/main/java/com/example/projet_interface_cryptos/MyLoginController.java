package com.example.projet_interface_cryptos;

import com.example.projet_interface_cryptos.BDD.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyLoginController {
    @FXML
    private TextField username;
    @FXML
    public  PasswordField password;
    @FXML
    public  Label  title;
    @FXML
    private Label loginmessagelabel;

    @FXML
    protected void logintosignup(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/SignUp.fxml", "login");

    }
    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM useraccounts WHERE Username ='" + username.getText() + "' AND password ='" + password.getText() + "'";

    try {
        Statement statement = connectDB.createStatement();
        ResultSet queryResult = statement.executeQuery(verifyLogin);

        while(queryResult.next()){
            if (queryResult.getInt(1) == 1) {
                SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");

            } else  {
                loginmessagelabel.setText("rentrez des valeurs valides");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}

