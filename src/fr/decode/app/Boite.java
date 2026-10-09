package fr.decode.app;

public class Boite<T> {
    private T contenu;
    public void mettre(T x) { contenu = x; }
    public T prendre()      { return contenu; }
}

