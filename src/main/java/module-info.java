module com.example.projet_interface_cryptos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires java.sql;
    requires mysql.connector.j;
    requires java.net.http;
    requires com.opencsv;


    opens com.example.projet_interface_cryptos to javafx.fxml;
    exports com.example.projet_interface_cryptos;
}