package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 // JDK 8
public class FourthTask {
    public static void main(String[] args) {

        List<String> different = new ArrayList<>();

        different.add(0, "Aloha");
        different.add(1, "Septyni");
        different.add(2, "Aloha");
        different.add(3, "Keturi");
        different.add(4, "Labukas");

        System.out.println("array list with duplicates: " + different);

        List<String> newList = different.stream().distinct().collect(Collectors.toList());

        System.out.println("array list without duplicates:" + newList);
    }
}
