package lt.codeacademy.first.project.examples.collection.map.tasks;

import java.util.HashMap;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        TaskThree task = new TaskThree();
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(2, "du");
        numbers.put(3, "trys");
        numbers.put(5, "penki");
        numbers.put(1, "vienas");

        Map<String, Integer> map = task.convertMap(numbers);
        task.printMap(map);
        task.printMapKeys(map);

        // kuriam nauja map'a, begame per jo reiksmes ir sudedame naujas reiksmes
        /* Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, String> entry: numbers.entrySet()){
            newMap.put(entry.getValue(), entry.getKey());
        } */

    }
    private Map<String, Integer> convertMap(Map<Integer, String> numbers) {
        Map<String, Integer> newMap = new HashMap<>();

        for(Map.Entry<Integer, String> entry: numbers.entrySet()){
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }

    private void printMap(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.printf("Raktas: %s, Reiksme: %s%n",entry.getKey(), entry.getValue());
        }
    }
    private void printMapKeys (Map<String, Integer> map) {
        for(String key: map.keySet()){
            System.out.printf("Raktas: %s%n", key);
        }
    }
}
