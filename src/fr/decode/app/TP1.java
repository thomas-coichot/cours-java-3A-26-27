package fr.decode.app;

import fr.decode.app.models.Etudiant;

public class TP1 {
    static void main(String[] args) {
        Etudiant[] etudiants = {
            new Etudiant("Alice", new int[]{12, 8, 14, 10}),
            new Etudiant("Bob", new int[]{10, 8, 15, 10}),
            new Etudiant("Charlie", new int[]{12, 8, 2, 3})
        };

        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }
}
