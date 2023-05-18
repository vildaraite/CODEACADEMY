package lt.codeacademy.first.project.examples.collection.list.tasks;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Five task = new Five();
        List<String> words = new ArrayList<>();

        String action;

        do {
            task.menu();
            action = sc.nextLine();
            task.selectAction(action, words, sc);
        } while (!action.equals("5"));
    }
        private void selectAction (String action, List<String> words, Scanner scanner) {
            switch (action){
                case "1" -> addWord((UnicodeSet) words);
                case "2" -> System.out.println("Rasti");
                case "3" -> System.out.println("Istrinti");
                case "4" -> System.out.println("Isvalyti");
                case "5" -> System.out.println("Programa baige darba");
                default -> System.out.println("Tokio veiksmo nera");
            }
        }

        private void addWord(UnicodeSet words){
            System.out.println("Iveskite zodi");
            Scanner sc = null;
            words.add(sc.nextLine());
        }
        private void findWord(List<String> words, Scanner scanner){
            System.out.println("Iveskite ieskoma zodi");
        }
    private void menu(){
        System.out.println("""
                1. iveskite zodi
                2. rasti zodi
                3. trinti zodi
                4. isvalyti sarasa
                5. baigti programa
                """);
    }
}
