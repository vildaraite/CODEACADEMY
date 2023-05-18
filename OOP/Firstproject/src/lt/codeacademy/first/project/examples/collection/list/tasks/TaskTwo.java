package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        // defaultinis listas, kuri naudojame!!!!!
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        TaskTwo task = new TaskTwo();

        boolean isExit;
        do{
            System.out.println("Iveskite zodi:");
            String line = sc.nextLine();

            isExit = line.equals("exit");
            if(line.equals("exit")) {
                task.addWord(words, line);
            }
        }while(!isExit);
    }

    private void addWord(List<String> words, String word){
        if(words.size() == 5 ){
            words.clear();
            return;
        }

        if(words.contains(word)){
            System.out.println("ERROR: toks zodis jau yra idetas!");
            return;
        }

        words.add(word);
    }
}
