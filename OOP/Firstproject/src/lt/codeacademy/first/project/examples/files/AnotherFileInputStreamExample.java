package lt.codeacademy.first.project.examples.files;

import java.io.*;
import java.util.Scanner;

public class AnotherFileInputStreamExample { // ne toks lengvas budas kaip fileinputestreamexample
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("example.txt");
            int letter;
            while ((letter = inputStream.read()) > 0) {
                System.out.println((char) letter);
            }
        } catch (IOException e) {
            System.out.println("Problema su failu " + e.getMessage());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Cannot close file" + e.getMessage());
                }
            }


        }
    }
}