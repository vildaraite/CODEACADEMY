package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.ArrayList;

public class TaskOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0, 7);
        numbers.add(1, 2);
        System.out.println(numbers);

        Integer remove = numbers.remove(0);
        System.out.println(numbers);
    }
}
