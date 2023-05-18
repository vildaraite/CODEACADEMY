package lt.codeacademy.first.project.examples.random.task;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa sugeneruoja skaičiu nuo 1 iki 100. Vartotojas turi 10 bandymų atspėti šį  skaičių.
 * Programa prašo vartotojo įvesti skaičių ir jį palygina su sugeneruotu ir išveda  pranešimą:
 * Įvestas skaičius per didelis, bandyk dar karta
 * Įvestas skaičius per mažas, bandyk dar karta
 * Valio!!! Atspėjote
 */
public class SecondTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        SecondTask task = new SecondTask();

        int randomNumb = random.nextInt(100) + 1;

        int count = 0;
        int value;
        do {
            count++;
            value = scanner.nextInt();

        } while(!task.isCorrectNumber(value, randomNumb) && count < 10);
    }

    private boolean isCorrectNumber(int value, int randomNumb) {
        boolean isCorrect = false;
        if(value > randomNumb) {
            System.out.println("Įvestas skaičius per didelis, bandyk dar karta");
        }else if(value < randomNumb) {
            System.out.println("Įvestas skaičius per mažas, bandyk dar karta");
        } else {
            System.out.println("Valio!!! Atspėjote");
            isCorrect = true;
        }

        return isCorrect;
    }
}