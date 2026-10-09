package fr.decode.app.models;

public interface Mesurable {
    double aire();                     // abstraite implicitement
    default boolean plusGrandQue(Mesurable o) {
        return aire() > o.aire();       // méthode par défaut
    }
}

