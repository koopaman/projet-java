module com.example.projet_interface_cryptos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.projet_interface_cryptos to javafx.fxml;
    exports com.example.projet_interface_cryptos;
}