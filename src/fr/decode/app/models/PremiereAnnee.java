package fr.decode.app.models;

public class PremiereAnnee extends Etudiant {

    public PremiereAnnee(String nom, int[] notes) {
        super(nom, notes);
    }


    @Override
    public String toString() {
        return nom;
    }

    public int[] getNotes(){
        return notes;
    }

    public String getNom(){
        return nom;
    }

    @Override
    public String getMessage(){
        return "BONJOUR";
    }
}
