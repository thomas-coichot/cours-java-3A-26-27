package fr.decode.app.models;

import fr.decode.app.exceptions.CarreException;

public class Carre implements Mesurable, Dessinable {
    private final double c;
    public Carre(double c) {
        if(c <= 0) throw new CarreException("Le côté du carré doit être positif. " + c );
        this.c = c;
    }
    @Override public double aire() { return c * c; }

    @Override
    public boolean plusGrandQue(Mesurable o) {
        return Mesurable.super.plusGrandQue(o);
    }

    @Override
    public void dessiner() {

    }
}

