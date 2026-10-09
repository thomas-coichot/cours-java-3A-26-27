package fr.decode.app;

public class Pizza {
    private final String taille;
    private final boolean fromage, jambon, olives;

    private Pizza(Builder b) {
        taille = b.taille;  fromage = b.fromage;
        jambon = b.jambon;  olives = b.olives;
    }

    public static class Builder {
        private final String taille;
        private boolean fromage, jambon, olives;
        public Builder(String taille) { this.taille = taille; }
        public Builder fromage() { fromage = true; return this; }
        public Builder jambon()  { jambon = true;  return this; }
        public Builder olives()  { olives = true;  return this; }
        public Pizza build()     { return new Pizza(this); }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "taille='" + taille + '\'' +
                ", fromage=" + fromage +
                ", jambon=" + jambon +
                ", olives=" + olives +
                '}';
    }
}

