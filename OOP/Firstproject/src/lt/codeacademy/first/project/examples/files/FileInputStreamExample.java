package lt.codeacademy.first.project.examples.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // file input streamas nuskaito baitus, todel reiketu pakestinti i chara
        // nereikia finally blocko nuo jdk 7, neuzdarinejam streamo, kas dedama i try blocko skliaustus
        // automatiskai yra kvieciamas finally blockas ir tuos streamus uzdaro automatiskai, gali buti irasomi keli streamai i skliaustus
        try (InputStream inputStream = new FileInputStream("example.txt")) {
            int letter;
            while((letter = inputStream.read()) > 0) {
                System.out.print((char)letter);
            }
        } catch(IOException e) {
            System.out.println("Problemos su failu "+ e.getMessage());
        }
    }
}
