package com.example.projet_interface_cryptos;

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

public class StockController {

    private static String API_URL =
            "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" +
                    "SEARCH_SYMBOL&interval=1min&apikey=FUND9T398QBJRUEL" ;
    @FXML
    private TextField symbol;
    @FXML
    private Label stockText;
    public void getStockInfo() {
        String stockSymbol = symbol.getText();
        String apiUrlWithKey = API_URL.replace("SEARCH_SYMBOL", stockSymbol);
        try {
// Make API request and parse JSON response
            JSONObject stockData = getStockData(apiUrlWithKey);
            String latestPrice = stockData.getJSONObject("Time Series (1min)")
                    .getJSONObject(stockData.getJSONObject("Meta Data").getString("3. Last Refreshed"))
                    .getString("4. close");
            stockText.setText("Latest Stock Price for "+stockSymbol+" is : $" + latestPrice);
        } catch (IOException e) {
            e.printStackTrace();
            stockText.setText("Error fetching stock information");
        }
    }
    //
    private JSONObject getStockData(String apiUrl) throws IOException {
        URL url = URI.create(apiUrl).toURL();
        HttpURLConnection connection = (HttpURLConnection)
                ((URL) url).openConnection();
        try (Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()))) {
            scanner.useDelimiter("\\A");
            String response = scanner.hasNext() ? scanner.next() : "";
            return new JSONObject(response);
        } finally {
            connection.disconnect();
        }
    }
}
