package lt.code.academy.repeat.tasks;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek norite ivesti skaiciu?");
        int number = sc.nextInt();

        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("iveskite skaicius: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Jusu ivesti skaiciai, kurie yra didesni uz 100");
        for (int i = 0; i < number; i++) {
            if (numbers[i] > 100) {
                System.out.println(numbers[i]);
            }
        }
    }
}
