package fr.decode.app.models;

import fr.decode.app.Utils;

import java.util.Arrays;
import java.util.Objects;

public class Etudiant {
    protected String nom;
    protected int[] notes;

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

    public String getMessage(){
        return "ALLO";
    }

    public void setNotes(int[] notes){
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(nom, etudiant.nom) && Objects.deepEquals(notes, etudiant.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, Arrays.hashCode(notes));
    }
}
