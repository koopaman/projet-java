package com.example.projet_interface_cryptos;

import java.util.HashMap;
import java.util.Map;

public class BienFinancier {
    private Map<String, Double> soldesArgent;
    private Map<String, Double> quantitesCryptos;
    private Map<String, Integer> quantitesActions;

    public BienFinancier() {
        this.soldesArgent = new HashMap<>();
        this.quantitesCryptos = new HashMap<>();
        this.quantitesActions = new HashMap<>();
    }

    public void acheter(String typeActif, String nom, double montant) {
        if (soldesArgent.containsKey(typeActif) && soldesArgent.get(typeActif) >= montant) {
            // Acheter l'actif en fonction du type (crypto ou action)
            if (typeActif.equalsIgnoreCase("crypto")) {
                quantitesCryptos.put(nom, quantitesCryptos.getOrDefault(nom, 0.0) + montant);
            } else if (typeActif.equalsIgnoreCase("action")) {
                quantitesActions.put(nom, quantitesActions.getOrDefault(nom, 0) + (int) montant);
            }

            // Mettre à jour le solde d'argent
            soldesArgent.put(typeActif, soldesArgent.get(typeActif) - montant);
        } else {
            System.out.println("Achat impossible. Solde insuffisant.");
        }
    }

    public void vendre(String typeActif, String nom, double quantite) {
        // Vérifier si l'utilisateur possède l'actif à vendre
        if ((typeActif.equalsIgnoreCase("crypto") && quantitesCryptos.containsKey(nom) && quantitesCryptos.get(nom) >= quantite)
                || (typeActif.equalsIgnoreCase("action") && quantitesActions.containsKey(nom) && quantitesActions.get(nom) >= quantite)) {
            // Vendre l'actif en fonction du type (crypto ou action)
            if (typeActif.equalsIgnoreCase("crypto")) {
                quantitesCryptos.put(nom, quantitesCryptos.get(nom) - quantite);
            } else if (typeActif.equalsIgnoreCase("action")) {
                quantitesActions.put(nom, quantitesActions.get(nom) - (int) quantite);
            }

            soldesArgent.put(typeActif, soldesArgent.getOrDefault(typeActif, 0.0) + quantite);
        } else {
            System.out.println("Vente impossible. Quantité insuffisante.");
        }
    }

    public Map<String, Double> getSoldesArgent() {
        return soldesArgent;
    }

    public Map<String, Double> getQuantitesCryptos() {
        return quantitesCryptos;
    }

    public Map<String, Integer> getQuantitesActions() {
        return quantitesActions;
    }
}
