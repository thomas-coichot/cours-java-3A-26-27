package fr.decode.app;

public class Utils {
    public static double moyenne(int[] notes) {
        int sum = 0;
        for(int note : notes){
            sum+= note;
        }

        return (double) sum / notes.length;
    }

    public static int compterAuDessus(int[] notes, int seuil){
        int count = 0;
        for (int note : notes) {
            if (note >= seuil) {
                count++;
            }
        }

        return count;
    }

}
