package lt.codeacademy.first.project.examples.homework;


import java.util.Scanner;

public class FourthTask {
    private int a = 50;
    private int b = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FourthTask task = new FourthTask();
        System.out.println("Iveskite a skaiciu:");
        task.a = scanner.nextInt();

        System.out.println("Iveskite b skaiciu:");
        task.b = scanner.nextInt();

        task.replaceValues();

        System.out.printf("Replaced a=%s b=%s%n", task.a, task.b);



    }
    private void replaceValues(){
        int temp = a;

        a = b;
        b = temp;
    }

}
