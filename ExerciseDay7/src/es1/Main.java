package es1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi da inserire");
        int n = Integer.parseInt(scanner.nextLine());

        List<String> allWords = new ArrayList<>();
        Set<String> distinctWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (int i = 0; i < n; i++) {

            System.out.println("Inserisci la parola " + (i + 1) + " : ");
            String word = scanner.nextLine().toLowerCase();
            allWords.add(word);

            if (!distinctWords.add(word)) {
                duplicateWords.add(word);

            }
        }
        scanner.close();

        if (duplicateWords.isEmpty()) {
            System.out.println("Non ci sono parole duplicate");

        } else {
            System.out.println("Parole duplicate : " + duplicateWords);
        }

        System.out.println("Numero di parole distinte : " + distinctWords.size());

        System.out.println("Parole distinte : " + distinctWords);
    }
}
