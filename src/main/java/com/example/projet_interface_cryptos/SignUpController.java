package com.example.projet_interface_cryptos;

import com.example.projet_interface_cryptos.BDD.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class SignUpController {

    PreparedStatement ps;


    @FXML
    private Label afficherusernew;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField messagerie;
    @FXML
    private TextField nomprenom;
    @FXML
    private TextField prenom;
    @FXML
    protected void signuptologin(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/MyLogin.fxml", "login");

    }

    public boolean registerUser() throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "INSERT INTO useraccounts values (?,?,?,?,?,?)";
        int ID = maxiduserAccounts() + 1;
        ps = connectDB.prepareStatement(verifyLogin);
        ps.setInt(1,ID);
        ps.setString(2,username.getText());
        ps.setString(3,password.getText());
        ps.setString(4,messagerie.getText());
        ps.setString(5,nomprenom.getText());
        ps.setString(6,prenom.getText());

        try {
            ps.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.out.println("username : " + username.getText() + "existe déja");
            connectDB.close();
            return false;
        }
        System.out.println("insert succesfull");
        afficherusernew.setText("insert successfull");
        connectDB.close();
        ps.close();
        return true;
    }

    private int maxiduserAccounts() throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String selectWID = "SELECT MAX(idUserAccounts) FROM javafxxxxxx.useraccounts;";
        ps = connectDB.prepareStatement(selectWID);

        ResultSet rs = ps.executeQuery();
        rs.next();
        int ID = rs.getInt("max(idUserAccounts)");
        return ID;
    }
}
