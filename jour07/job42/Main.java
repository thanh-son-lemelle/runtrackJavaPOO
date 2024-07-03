package jour07.job42;

import jour07.job41.Avion;
import jour07.job41.Voiture;

public class Main {

    public static void main(String[] args) {
        Voiture v = new Voiture("Renault", 2010, 10000, 5000, 5, 100, 50000);
        Avion a = new Avion("Airbus", 2015, 1000000, "HELICES", 5000);

        v.affiche();
        a.affiche();

        v.calculePrix(2021);
        a.calculePrix(2021);

        v.affiche();
        a.affiche();
    }

}
