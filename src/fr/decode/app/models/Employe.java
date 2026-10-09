package fr.decode.app.models;

import java.util.List;

public abstract class Employe {
    protected String nom;
    protected double age;
    protected Employe(String nom) {
        this.nom = nom;
    }

    public abstract double salaire();

    public static double masseSalariale(List<Employe> employeList){
        double sum = 0;

        for(Employe employe : employeList){
            sum += employe.salaire();
        }

        return sum;
    }
}
