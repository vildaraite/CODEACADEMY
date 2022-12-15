package lt.codeacademy.first.project.examples.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeTaskOne {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Iveskite laika:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        LocalTime time = LocalTime.parse(text, f);
        System.out.println("Ivestas laikas:" + time);

        System.out.println("Pradejus dvi valandas ir penkiolika pinuciu:" + time.plusHours(2).plusMinutes(15));


    }
}
