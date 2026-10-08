package fr.decode.app.models;

import fr.decode.app.Utils;

public class Etudiant {
    final private String nom;
    final private int[] notes;

    public Etudiant(String nom, int[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    @Override
    public String toString(){
        return String.format("Etudiant %s : moyenne = %.2f, admis = %b", nom, getAverage(), estAdmis());
    }

    public double getAverage(){
        return Utils.moyenne(notes);
    }

    public boolean estAdmis(){
        return getAverage() >= 10;
    }
}
