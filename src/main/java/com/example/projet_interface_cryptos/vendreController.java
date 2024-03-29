package com.example.projet_interface_cryptos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class vendreController {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextField priceTextField;

    @FXML
    public void buyButtonClicked(ActionEvent event) {
        String name = nameTextField.getText();
        int quantity = Integer.parseInt(quantityTextField.getText());
        double price = Double.parseDouble(priceTextField.getText());

        double totalCost = quantity * price;

        System.out.println("Vente : " + quantity + " " + name + " pour " + price + " $ chacune. Coût total : " + totalCost + " $");
    }
    @FXML
    protected void retourvendre(ActionEvent e){
        SceneManager.changeScene("/com/example/projet_interface_cryptos/WelcomePage.fxml", "actifs");
    }


}