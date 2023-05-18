package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        // list.of negalime modifikuoti, nei atimti nei prideti
        List<String> words = List.of("Labas", "Labukas", "Labuciukas", "Labuciukiauskas");
      String w = "";
        for(String word: words)  {
            if(word.length() > w.length()){
                w = word;
            }
        }
        System.out.println("Ilgiausias zodis yra: " + w);
    }

    }

