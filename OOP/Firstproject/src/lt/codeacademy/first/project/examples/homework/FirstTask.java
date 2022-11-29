package lt.codeacademy.first.project.examples.homework;

import java.util.Scanner;

/**
 * 1. sudarykite programa, kuri paprasytu vartotojo ivesti skaiciu ir ji atspausdintu tokiu formatu:
 * Jus ivedate skaiciu 5
 * cia 5 - vartotojo ivestas skaicius

 */

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int numb = scanner.nextInt();

        FirstTask firstTask = new FirstTask();
        firstTask.printNumber(numb);

    }
    private void printNumber(int numb){
        System.out.println("Jus ivedete skaiciu: " + numb);
    }
}
