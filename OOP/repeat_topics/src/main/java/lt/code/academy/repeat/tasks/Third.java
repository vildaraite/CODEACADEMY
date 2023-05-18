package lt.code.academy.repeat.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Iveskite skaiciu, skaicius 0 baigia programos darba");
        int number = scan.nextInt();

        Third third = new Third();

        while (number != 0) {
            sum = third.sum(sum, number);
            number = scan.nextInt();
        }

        System.out.println("Jusu ivestu skaiciu suma : " + sum);
    }

    private int sum(int sum, int num) {
        return sum + num;
    }
}
