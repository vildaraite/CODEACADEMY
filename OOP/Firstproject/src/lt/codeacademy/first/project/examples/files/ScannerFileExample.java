package lt.codeacademy.first.project.examples.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) throws FileNotFoundException {
        // jei nurodome pathname viskas turi  buti \\ su dviem sleshais
        File file = new File("example.txt");
        Scanner scanner = new Scanner(file);

        // scanneris nuskaito failus, cia paprasciausias budas, kaip tai padaryti
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

    }
}