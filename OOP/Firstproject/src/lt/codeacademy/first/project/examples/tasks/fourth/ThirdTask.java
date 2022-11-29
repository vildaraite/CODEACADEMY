package lt.codeacademy.first.project.examples.tasks.fourth;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite a skaiciu: ");
        double a = sc.nextDouble();
        System.out.println("Iveskite b skaiciu: ");
        double b = sc.nextDouble();


        ThirdTask thirdTask = new ThirdTask();
        System.out.printf("Average: %s", thirdTask.average(a, b));
    }

    private double average(double a, double b){

        return (a + b) / 2;
    }
}
