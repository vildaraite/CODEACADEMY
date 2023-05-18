package lt.codeacademy.first.project.examples.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {


    // Andriaus examples
            // listus naudojame, kai nesvarbu ar tai unikalios reiksmes ar ne, koks ju rikiavimas ir t.t.
            // viska sudedame kaip norime ir mums nesvarbu\
            // implementacines poklases arraylistas ir linkedlistats (greitas iterpimas salinimas, zino elementus pries ji esancius ir po jo esancius)

            //ArrayList ArrayList <cia rasosi kokio tipo kintamuosius sita kolekcija gali saugoti> rasosi klase
            ArrayList<Integer> numbers = new ArrayList<>();
            List<Integer> secondNumbers = new ArrayList<>();

            //LinkedList
            LinkedList<Integer> indexes = new LinkedList<>();
            List<Integer> secondIndexes = new LinkedList<>();

            List<Integer> thirdNumbers = List.of(1, 5, 8, 9, 15);

            //create new collection from given old collection
            List<Integer> newNumbers = new ArrayList<>(secondNumbers);

            //add ideti i lista, i kolekcija
            numbers.add(5);
            numbers.add(10);
            numbers.add(55);
            numbers.add(1);
            secondNumbers.add(9);
            secondNumbers.add(10);
            secondNumbers.add(11);
            numbers.add(0, 100);
            numbers.addAll(secondNumbers);

            // get by index, paimti elementa
            int number = numbers.get(0);
            System.out.println(number);

            // size, gausim kiek elementu kiek yra elementu toje kolekcijoje
            System.out.println("size " + numbers.size());

            // isEmpty - grazina ar listas uzpildytas ar ne, grazina true jei elementu toje kolekcijoje nera
            System.out.println(numbers.isEmpty());
            System.out.println(indexes.isEmpty());

            //remove by index - isimti galime
            Integer remove = numbers.remove(2);
            System.out.println("removed " + remove);

            // Sort collection
            Collections.sort(numbers);

            //sublist - naujas listas
            List<Integer> integers = numbers.subList(0, 5);

            //contains - patikrina ar elementas yra kolekcijoje
            System.out.println("contains " + numbers.contains(100));



            //indexes.getFirst();
            //indexes.getLast();
            //secondIndexes.getFirst();
            //secondIndexes.getLast();

            printCollection(numbers);
            printCollection(secondNumbers);
            printCollection(indexes);
            printCollection(secondIndexes);
            printCollection(integers);

            //Clear - isvalo kolekcija
            integers.clear();
            printCollection(integers);

            int a = indexes.getLast();
            int b = indexes.getFirst();

            indexes.addFirst(50);
            indexes.addLast(40);

        }

        private static void printCollection(List<Integer> numbers) {
            System.out.println("--------------------------");
            numbers.forEach(System.out::println);
        }
    }

