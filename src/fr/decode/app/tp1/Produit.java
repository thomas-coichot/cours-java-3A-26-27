package fr.decode.app.tp1;

public record Produit(String nom, double prix) {
    public Produit {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix du produit ne peut pas être négatif.");
        }
    }
}
