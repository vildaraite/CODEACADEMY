package lt.codeacademy.first.project.examples.random.task;

import java.util.Random;
import java.util.Scanner;

public class RandomDice {
    public static void main(String[] args) {
        Random random = new Random();

        int first = random.nextInt(6) + 1;
        int second = random.nextInt(6) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Koks jusu spejimas?");
        int numb = scanner.nextInt();

        int sum = first + second;

        System.out.println("Pirmasis išrideno - " + first);
        System.out.println("ntrasis išrideno - " + second);
        if(sum > numb) {
            System.out.printf("Spėjimas – %d. Reikėjo spėti %d didesni skaičių",numb, sum - numb);
        } else if(sum < numb) {
            System.out.printf("Spėjimas – %d. Reikėjo spėti %d mazesni skaičių",numb, numb - sum);
        } else {
            System.out.println("Atspejote !!!!");
        }

    }
}