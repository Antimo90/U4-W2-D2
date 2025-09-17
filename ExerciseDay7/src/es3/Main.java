package es3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.addContatto("pio", 324645854);
        rubrica.addContatto("Goku", 58354);

        System.out.println(rubrica.getContatti());
        rubrica.removeContatto("pio");
        System.out.println(rubrica.getContatti());

        System.out.println(rubrica.searchNumber(58354));


    }
}
