package fr.decode.app;


import java.util.HashMap;
import java.util.Map;

public final class Configuration {
    private static Configuration instance;
    private final Map<String, String> valeurs = new HashMap<>();

    private Configuration() { }                 // constructeur privé !

    public static synchronized Configuration getInstance() {
        System.out.println("Appel de getInstance()");
        if (instance == null) {
            System.out.println("nouvelle instance");// création paresseuse
            instance = new Configuration();
        }
        System.out.println("Instance existante");
        return instance;
    }

    public String get(String cle) { return valeurs.get(cle); }
}
