package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class actionController {


    @FXML
    public Label actionici;
    @FXML
    protected void retouraction(ActionEvent e){
        SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");

    }
    private static String API_URL =
            "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=SEARCH_SYMBOL&interval=1min&apikey=FXKRRKK2FWVFZSZG" ;

    public void showActions() {
        String stockSymbol = "IBM";
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
                double totalPrice = 18 * Double.parseDouble(latestPrice);
                actionici.setText("poyohermano possède 18 actions IBM à " + stockSymbol + " soit " + totalPrice + "dollars");
            }

        } catch (IOException e) {
            e.printStackTrace();
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
