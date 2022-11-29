package lt.codeacademy.first.project.examples.tasks.fourth;

import java.util.Scanner;

/*
Sudarykite programą, kuri paskaičiuotų ir
atspausdintų reiškinio = a + b reikšmę.
Čia a ir b − vartotojo įvesti sveikieji skaičiai.
 */
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu a:");
        int a = scanner.nextInt();

        System.out.println("Iveskite skaiciu b:");
        int b = scanner.nextInt();

        SecondTask secondTask = new SecondTask();
        int sum = secondTask.sum(a, b);

        System.out.printf("%s + %s = %s%n", a, b, sum);

    }

    private int sum( int a, int b) {
        return a + b;
    }
}
