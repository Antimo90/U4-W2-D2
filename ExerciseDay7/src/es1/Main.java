package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> distinctWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();


        try {
            logger.info("Inserisci il numero di elementi da inserire");
            int n = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i < n; i++) {

                logger.info("Inserisci la parola " + (i + 1) + " : ");
                String word = scanner.nextLine().toLowerCase();


                if (!distinctWords.add(word)) {
                    duplicateWords.add(word);

                }
            }
            scanner.close();

            if (duplicateWords.isEmpty()) {
                logger.info("Non ci sono parole duplicate");

            } else {
                logger.info("Parole duplicate : " + duplicateWords);
            }

            logger.info("Numero di parole distinte : " + distinctWords.size());

            logger.info("Parole distinte : " + distinctWords);

        } catch (NumberFormatException e) {

            logger.error("Devi inserire un numero valido" + e.getMessage());
        }

        scanner.close();
    }
}
