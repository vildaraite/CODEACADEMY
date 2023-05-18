package lt.codeacademy.first.project.examples.operators.tasks;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu:");
        long x = sc.nextLong();

        System.out.println("Jus ivedete skaiciu:" + x);

        if (x > 0){
            long result = 2 * x + 8;
            System.out.println("rezultatas yra:" + result);
        } else if (x < 0) {
            long result = 21 - 7 * x;
            System.out.println("rezultatas yra:" + result);
        } else {
            System.out.println("skaicius yra nulis!");
        }
    }
}
