package lt.codeacademy.first.project.examples.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TaskOne {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(12);
        numbers.add(13);
        numbers.add(2);
        numbers.add(34);
        numbers.add(45);

        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.add(13);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println(numbers.contains(34));

        System.out.println(numbers.remove(45));

        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
