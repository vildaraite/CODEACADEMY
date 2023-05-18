package lt.codeacademy.first.project.examples.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite ka norite irasyti i faila:");
        String line = scanner.nextLine();

        //create file if not exist
        File file = new File("output.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch(IOException e) {
                System.out.println("Cannot create file " + e.getMessage());
            }
        }

        // write to file by bites
        try (FileOutputStream outputStream = new FileOutputStream(file, true)){
            for(int i = 0; i < line.length(); i++){
                outputStream.write(line.charAt(i));
            }
        } catch(IOException e) {
            System.out.println("Cannot write to file: " + e.getMessage());
        }
    }
}