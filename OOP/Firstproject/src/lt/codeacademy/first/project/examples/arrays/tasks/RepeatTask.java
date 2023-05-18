package lt.codeacademy.first.project.examples.arrays.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepeatTask {
    public static void main(String[] args) {
        RepeatTask task = new RepeatTask();
        int[] mas = task.fillMass();

        int max = task.getMax(mas);
        System.out.println("Max mas number: " + max);

        double average = task.getArrayAverage(mas);
        System.out.println("Array average: " + average);

        int powSum = task.powSum(mas);
        System.out.println("Array pow sum: " + powSum);
    }

    private int[] fillMass() {
        Scanner sc = new Scanner(System.in);

        int length = getCorrectNumber(sc, "Iveskite elementu skaiciu");

        int[] mas = new int[length];

        for(int i = 0; i < mas.length; i++) {
            mas[i] = getCorrectNumber(sc, String.format("Iveskite %s element:%n", i + 1));
        }

        return mas;
    }

    private int getCorrectNumber(Scanner sc, String text) {
        for(;;) {
            try {
                // cia dedamas kodas kur ivyksta klaida
                System.out.println(text);
                return sc.nextInt();
            }
            catch(InputMismatchException e) {
                // cia daroma logika kai ivyksta klaida
                System.out.println("Blogas formatas!");
                sc.nextLine();
            }
        }
    }

    private int getMax(int[] mas) {
        int max = mas[0];
        for(int i = 1; i < mas.length; i++) {
            int value = mas[i];
            if(value > max) {
                max = value;
            }
        }

        return max;
    }

    private double getArrayAverage(int[] mas) {
        int sum = 0;
        for(int i = 0; i < mas.length; i++) {
            sum+= mas[i];
        }

        return sum / mas.length;
    }

    private int powSum(int[] mas) {
        int sum = 0;
        for(int i = 0; i < mas.length; i++) {
            sum+= Math.pow(mas[i], 2);
        }

        return sum;
    }
}

