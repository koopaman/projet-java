package com.example.projet_interface_cryptos;

import javafx.scene.control.TextField;

public class Entity {
    private String username;
    private String password;
    public Entity(TextField email, String password) {
        this.username = username;
        this.password = password;
    }
    public String getEmail() {
        return username;
    }
}