package lt.codeacademy.first.project.examples.method.tasks;

import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;

public class TaskFourthDifferent {
    /*
     •Klasė turi main metodą, kuris kviečia jūsų sukurtus du static metodus:
     •m1() ir po to m2()•metodai turi gražinti double rezultatą
     •main metode: metodų rezultatai priskiriami kintamiesiams d1, d2
     •main metodas išspausdina jų sumą
     •m1() - metodas gražina double tipo reikšmę 123.5;
     •m2() - metodas gražina double tipo reikšmę kurią įvedame į programą

     kad veiktu tokie metodai - skleidziame dropdowna - edit configuration, program arguments dedame argumentus
    */
    public static void main(String[] args) {

        double numbOne = firstMethod(args);
        double numbTwo = secondMethod(args);
        double sum = sum(numbTwo, numbTwo);

        System.out.println("suma: " + sum);

    }

    public static double firstMethod(String[] args){
        // tada kintamuju nereikia - return 123.5;
        String value = args[0];
       return Double.parseDouble(value);
       // kiekvienas primityvas turi savo neprimityva, padarem, kad metodas turetu stringo parametrus
        // stringo parametro vardu value padavame pirma elementa masyve ir jis grazino double mums
    }

    public static double secondMethod(String[] args){
        // pasiduodam i parametrus stringus su vardais
        String value = args[1];
        return Double.parseDouble(value);//masyvas apie kuri kalbesime dar
    }

    public static double sum(double x, double y) {

        return x + y;
}
}