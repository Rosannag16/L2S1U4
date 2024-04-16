package Esercizio1;

public class esercizio {

    // Metodo per verificare se la lunghezza della stringa è pari o dispari
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    // Metodo per verificare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }

    public static void main(String[] args) {
        // Esempi di utilizzo dei metodi
        String stringa1 = "ciao";
        String stringa2 = "hello";
        int anno1 = 2020;
        int anno2 = 2021;

        System.out.println("La lunghezza della stringa '" + stringa1 + "' è pari: " + stringaPariDispari(stringa1));
        System.out.println("La lunghezza della stringa '" + stringa2 + "' è pari: " + stringaPariDispari(stringa2));

        System.out.println("L'anno " + anno1 + " è bisestile: " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile: " + annoBisestile(anno2));
    }
}
