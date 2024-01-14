package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class welcomeController {


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    @FXML
    protected void setButton1(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/Stock.fxml", "login");

    }
    @FXML
    protected void buttonbancaire(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte argent.fxml", "actifs en cash");
    }
    @FXML
    protected void buttoncrypto(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte crypto.fxml", "actifs en crypto");
    }
    @FXML
    protected void buttonaction(ActionEvent e) {
        SceneManager.changeScene("/com/example/projet_interface_cryptos/compte actions.fxml", "actifs en actions");
    }

    private static String API_URL =
            "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=SEARCH_SYMBOL&interval=1min&apikey=FXKRRKK2FWVFZSZG" ;
    @FXML
    private TextField symbol;
    @FXML
    private Label stockText;
    public void getStockInfo() {
        String stockSymbol = symbol.getText();
        String apiUrlWithKey = API_URL.replace("SEARCH_SYMBOL", stockSymbol);
        try {
            JSONObject stockData = getStockData(apiUrlWithKey);

            // Vérifie si la clé "Time Series (1min)" existe dans l'objet JSON
            if (stockData.has("Time Series (1min)")) {
                JSONObject timeSeries = stockData.getJSONObject("Time Series (1min)");

                // Obtient la première clé dans l'objet timeSeries
                String firstKey = timeSeries.keys().next();
                JSONObject latestData = timeSeries.getJSONObject(firstKey);

                // Obtient le prix de clôture
                String latestPrice = latestData.getString("4. close");

                stockText.setText("Latest Stock Price for " + stockSymbol + " is : $" + latestPrice);
            } else {
                // Gérez le cas où la clé "Time Series (1min)" n'est pas présente
                stockText.setText("aucune valeur trouvée");
            }
        } catch (IOException e) {
            e.printStackTrace();
            stockText.setText("Error fetching stock information");
        }
    }
    //
    private JSONObject getStockData(String apiUrl) throws IOException {
        URL url = URI.create(apiUrl).toURL();
        HttpURLConnection connection = (HttpURLConnection)
                url.openConnection();
        try (Scanner scanner = new Scanner(new
                InputStreamReader(connection.getInputStream()))) {
            scanner.useDelimiter("\\A");
            String response = scanner.hasNext() ? scanner.next() : "";
            return new JSONObject(response);
        } finally {
            connection.disconnect();
        }
    }

}