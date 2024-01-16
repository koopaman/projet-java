package com.example.projet_interface_cryptos;

public class Account {
    private String accountId;
    private Wallet wallet;

    public Account(String accountId, Wallet wallet) {
        this.accountId = accountId;
        this.wallet = wallet;
    }

    public String getAccountId() {
        return accountId;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public double getBalance() {
        return wallet.getBalance();
    }
}