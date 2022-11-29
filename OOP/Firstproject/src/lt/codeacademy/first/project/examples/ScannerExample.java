package lt.codeacademy.first.project.examples;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // system.in is vartotojo ivestis, atidaro objekta, sasaja tarp konsoles(terminalo) ir musu programos
        Scanner scanner = new Scanner(System.in);

       /*String firstTekst = scanner.next();
        String secondTekst = scanner.next();
        System.out.println(firstTekst);
        System.out.println(secondTekst);
        // sie spausdina po zodeli iki tarpo */


        // spausdina visa teksta
        /* String line = scanner.nextLine();
        System.out.println(line);

        int number = Integer.parseInt(line);
        int number = scanner.nextInt();
        System.out.println("Ivestas skaicius" + number);

        double doubleValue = scanner.nextDouble();
        System.out.println("Ivestas skaicius su kableliu " + doubleValue);

        }
         */
        System.out.println("Iveskite x reiksme:");
        int x = scanner.nextInt();

        System.out.println("Iveskite y reiksme:");
        int y = scanner.nextInt();

        // kuriam objekta, nes STATINIAI NESTATINIU tiesiogiai nekviecia
        ScannerExample scannerExample = new ScannerExample();
        // kvieciam ta metoda per OBJEKTO VARDAS.METODO VARDAS
        int result = scannerExample.multiply(x, y);

        System.out.println(result);
    }
        private int multiply(int x, int y) {
        return x * y;


    }
}
