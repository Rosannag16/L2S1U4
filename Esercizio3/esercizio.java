package Esercizio3;

import java.util.Scanner;

public class esercizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.println("Inserisci una stringa (o \":q\" per uscire):");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    result.append(input.charAt(i));
                    if (i != input.length() - 1) {
                        result.append(",");
                    }
                }
                System.out.println(result);
            }

        } while (!input.equals(":q"));

        scanner.close();
    }
}
