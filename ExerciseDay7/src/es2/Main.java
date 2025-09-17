package es2;

/*Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N
interi casuali da 0 a 100. Scrivere una seconda funzione che accetti una lista e restituisca
una nuova lista composta dagli elementi della prima lista seguiti dagli stessi elementi
disposti in ordine inverso. Scrivere una terza funzione che accetti una lista ed un
booleano: se il booleano è true stampa i valori in posizioni pari, altrimenti stampa i valori in
posizioni dispari. Creare una main che utilizzi le tre funzioni. Utilizzare l'interfaccia List e
l'implementazione ArrayList.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);


    public static void stampaPosizioni(List<Integer> lista, boolean isPari) {
        logger.info("Elementi nella posizione Pari o Dispari");
        for (int i = 0; i < lista.size(); i++) {
            if (isPari && i % 2 == 0) {
                logger.info("i numeri nella posizione pari sono " + lista.get(i));
            } else if (!isPari && i % 2 != 0) {
                logger.info("i numeri nella posizione pari sono " + lista.get(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = 0;
        try {
            logger.info("Inserisci il numero di elementi da creare");
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                throw new IllegalArgumentException("Il numero dei elementi deve essere un numero positivo");

            }

            List<Integer> listaOriginale = generaListaCasuale(n);
            logger.info("Lista originale Ordinata : " + listaOriginale);

            List<Integer> listaSpeculata = duplicaListaInvertita(listaOriginale);
            logger.info("Nuova Lista Speculare : " + listaSpeculata);

            logger.info("Vuoi stampare le posizioni pari? (true/false)");
            boolean isPari = Boolean.parseBoolean(scanner.nextLine());
            stampaPosizioni(listaSpeculata, isPari);

        } catch (NumberFormatException e) {
            logger.error("Errore, input non valido. Inserisci un numero intero");

        } catch (IllegalArgumentException e) {
            logger.error("ERRORE : " + e.getMessage());
        }
        scanner.close();
    }

    public static List<Integer> generaListaCasuale(int n) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int casuali = random.nextInt(100) + 1;
            lista.add(casuali);
        }
        Collections.sort(lista);
        return lista;

    }

    public static List<Integer> duplicaListaInvertita(List<Integer> listaOriginale) {
        List<Integer> nuovaLista = new ArrayList<>(listaOriginale);
        List<Integer> listaInvertita = new ArrayList<>(listaOriginale);
        Collections.reverse(listaInvertita);
        nuovaLista.addAll(listaInvertita);
        return nuovaLista;

    }

}
