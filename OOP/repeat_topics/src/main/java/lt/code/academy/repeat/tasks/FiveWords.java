package lt.code.academy.repeat.tasks;

import java.util.Scanner;

public class FiveWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Įveskite 5 žodžius:");

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        System.out.println("\nJūsų įvesti žodžiai:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
