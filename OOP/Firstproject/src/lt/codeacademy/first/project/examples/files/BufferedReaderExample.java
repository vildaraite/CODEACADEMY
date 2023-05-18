package lt.codeacademy.first.project.examples.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // skaito line by line, turi ganetinai daug implementaciju daug budu nuskaityt
        // klase yra placiai implementuota ir is principo visus atvejus galima pasidengtis su viena klase

        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}
