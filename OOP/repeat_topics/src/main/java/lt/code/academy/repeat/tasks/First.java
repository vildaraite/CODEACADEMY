package lt.code.academy.repeat.tasks;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite norima skaiciu");
        int number = sc.nextInt();

        First first = new First();

        System.out.println(first.isLeap(number));

    }

    private String isLeap (int number) {
        if (number % 2 != 0) {
            return "lyginis";
        }
        return "nelyginis";
    }
}
