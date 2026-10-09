package fr.decode.app.models;

public class Cdi extends Employe{
    private double fixe;
    public Cdi(String nom, double fixe) {
        super(nom);
        this.fixe = fixe;
    }

    @Override
    public double salaire() {
        return fixe;
    }
}
