package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFourth {
    public static void main(String[] args) {
        List<String> words = List.of("Beta", "Kriste", "Antanina","Beta","Zivile");
        TaskFourth task = new TaskFourth();

    }

    private List <String> getUniqueWords(List <String> words){
        List <String> uniqueWords = new ArrayList<>();
        for(String word: words){
            if(!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }
}
