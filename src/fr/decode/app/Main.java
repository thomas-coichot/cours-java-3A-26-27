package fr.decode.app;

import fr.decode.app.interfaces.Notification;
import fr.decode.app.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        // DEMO

        /*Configuration config = Configuration.getInstance();


        Etudiant etudiant = new Etudiant("Alice", new int[]{12, 8, 14, 10});
        Etudiant etudiant2 = new Etudiant("Alice", new int[]{12, 8, 14, 10});

        PremiereAnnee premiereAnnee = new PremiereAnnee("Première Année", new int[]{12, 8, 14, 10});

        Boite<Carre> boiteCarre = new Boite<Carre>();
        Carre carre = null;

        try {
          carre = new Carre(0);

       } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        if(carre != null){
            System.out.println("Carré mis dans la boîte : " + boiteCarre.prendre());
        }


        boiteCarre.mettre(carre);


        Boite<Etudiant> boite = new Boite<Etudiant>();

        boite.mettre(etudiant);

        System.out.println(premiereAnnee.getMessage());

        Configuration config2 = Configuration.getInstance();
        Configuration config3 = Configuration.getInstance();

        System.out.println(config == config2);
        System.out.println(config == config3);


        System.out.println(etudiant.equals(etudiant2));

        Notification notification = NotificationFactory.creer("sms","Bonjour, ceci est un test de notification.");

        System.out.println(notification);

        Pizza pizza = new Pizza.Builder("Margherita")
                .fromage()
                .jambon().olives().build();


        System.out.println(pizza);


        Cdi cdi = new Cdi("John", 1000);
        Freelance freelance = new Freelance("Jane", 50, 160);
        Freelance freelance1 = new Freelance("Jane", 50, 160);
        Freelance freelance2 = new Freelance("Jane", 50, 160);
        Freelance freelance3 = new Freelance("Jane", 50, 160);

        List<Employe> employes = new ArrayList<>(List.of(cdi, freelance, freelance1, freelance2, freelance3));


        System.out.println(Employe.masseSalariale(employes));*/

        int n = 100000000;
        int s = 0;
        /*for (int i = 0; i < n; i++) { // n
            System.out.println(i);
            s++;
        };
        for (int j = 0; j < n; j++){ // n
            System.out.println(j);
            s++;
        };*/

        // O(n)

        //factorielle(10, 0);

        //fib(100);

        //fibMemo(100, new long[101]);

        // System.out.println(sommeChiffres(123345668));

        //System.out.println(puissance(10, 3));

        // estPalindrome("ressasser");


    }

    static long factorielle(int n, int depth) {
        if (n <= 1) {              // cas de base : on s'arrête
            return 1;
        }
        System.out.println("Calcul de factorielle(" + n + "), profondeur : " + depth);
        return n * factorielle(n - 1, depth + 1); // cas récursif
    }

    static long fib(int n) {
        if (n < 2) return n;
        System.out.println("Calcul de fib(" + n + ")");
        return fib(n - 1) + fib(n - 2);
    }

    static long fibMemo(int n, long[] memo) {
        if (n < 2) return n;
        if (memo[n] != 0) return memo[n];
        System.out.println("Calcul de fib(" + n + ")");
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }

    static int sommeChiffres(int n) {
        if (n < 10) return n;

        System.out.println("Calcul de sommeChiffres(" + n + ")");

        return n % 10 + sommeChiffres(n / 10);
    }

    static long puissance(long x, int n) {
        if (n == 0) {
            return 1;
        }

        long moitie = puissance(x, n / 2);

        if (n % 2 == 0) {
            return moitie * moitie;
        }

        return x * moitie * moitie;

    }

    static boolean estPalindrome(String s) {

        System.out.println("Vérification de estPalindrome(" + s + ")");

        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return estPalindrome(s.substring(1, s.length() - 1));
    }


}

