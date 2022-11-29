package lt.codeacademy.first.project.examples.homework;


import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite 4 skaitmenu skaiciu: ");
        String text = sc.nextLine();
                // nepabaigta
    }

    private void printNumbers(String text) {

        System.out.printf("[1] -> %s%n [2] -> %s%n [3] ->%s%n [4] -> %s%n", text.charAt(0), text.charAt(1), text.charAt(2), text.charAt(3));
    }
}
