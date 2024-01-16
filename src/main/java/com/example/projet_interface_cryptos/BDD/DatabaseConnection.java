package com.example.projet_interface_cryptos.BDD;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String dataBasename = "javafxxxxxx";
        String dataBaseUsername = "root";
        String databasePassword = "Aujuarma200361829!";
        //String dataBaseMessagerie = "";
        //String dataBaseNom = "";
        //String dataBasePrenom = "";
        String url = "jdbc:mysql://localhost:3306/"+dataBasename;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,dataBaseUsername, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databaseLink;
    }
    //public void main(String[] args) {
      //  Connection con = getConnection();             pour tester la connexion à la base de donnée
        //System.out.println(con);
        //System.out.println("success");
    //}


}
