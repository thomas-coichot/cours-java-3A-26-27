package fr.decode.app.models;

public class Freelance extends Employe {
    private double taux;
    private double heures;

    public Freelance(String nom, double taux, double heures) {
        super(nom);
        this.taux = taux;
        this.heures = heures;
    }

    @Override
    public double salaire() {
        return taux * heures;
    }
}
