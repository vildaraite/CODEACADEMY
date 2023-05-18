package lt.codeacademy.first.project.examples.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BufferedWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite teksta: ");
        String line = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))) {
            bw.write(line);
            bw.newLine();
        }catch (IOException e) {
            System.out.println("Cannot write to file: " + e.getMessage());
        }
    }
}
