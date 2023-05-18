package lt.codeacademy.first.project.examples.collection.map;

import com.sun.source.tree.Tree;

import java.util.*;
// mapas nuo listo ir seto skiriasi, nes mape elementai saugomi poromis
// key value principu, key ir value - suagome poromis
// pagal key galime gauti value
// hashmapas, linkedhasmepai ir treemap
// skiriasi taip pat kaip setuose hashmapas saugo bet kokia tvarka
// linkedhashmapas taip kaip sudejome, treemapas didejimo tvarka, viskas atliekama pagal key'u, ne value
// jei tokia pati reiksme dedama su tuo paciu key, perraso ta elementa pagal kita value

public class MapExample {
    public static void main(String[] args) {
        MapExample example = new MapExample();
        example.hashMapExample();
        example.linkedHashMapExample();
        example.treeMapExample();
        example.hashMapExample();

    }
    private void hashMapExample(){
        Map<Integer, String> names = new HashMap<>();
        // KEY TURI BUTI UNIKALUS
        names.put(1, "Petras");
        names.put(2, "Vilius");
        names.put(4, "Juozas");
        names.put(1, "Kristupas"); // atnaujina reiksme pagal key, PASILIKS Kristupo stringas

        System.out.println(names.get(2));
        System.out.println(names.keySet());

        System.out.println("----------------");
        for(Integer key : names.keySet()){
            System.out.printf("%s-%s%n", key, names.get(key));
        }


        System.out.println("----------------");
        names.keySet().forEach(key -> System.out.printf("%s-%s%n", key, names.get(key)));

        System.out.println("----------------");
        for(Map.Entry<Integer, String> entry: names.entrySet()){
            System.out.printf("%s-%s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("-----------------");
        names.entrySet().forEach(entry -> System.out.printf("%s-%s%n", entry.getKey(),entry.getValue()));

        Map<User, Integer> users = new HashMap<>();
        users.put(new User(1,"Vilda"), 5);
        users.put(new User(3,"Zita"), 4);
        users.put(new User(4,"Vika"), 5);
        users.put(new User(2,"Vale"), 2);
        users.put(new User(1,"Vilda"), 15);

        users.forEach((key, value) -> System.out.printf("%s-%s%n", key, value));
    }

    private void linkedHashMapExample(){
        Map<String, Double> prices = new LinkedHashMap<>();
        prices.put("Jogurtas", 2.5);
        prices.put("Duona", 2.0);
        prices.put("Pienas", 1.6);
        prices.put("Mandarinai", 0.99);

        System.out.println("___________________");
        prices.forEach((k, v) -> System.out.printf("%s-%s%n", k, v));
    }

    private void treeMapExample(){
        Map<Integer, String> names = new TreeMap<>();
        names.put(3, "Vilda");
        names.put(8, "Abigaile");
        names.put(4, "Veronika");
        names.put(1, "Milda");
        names.put(6, "Justina");

        System.out.println("___________________");
        for(Integer key: names.keySet()){
            System.out.printf("%s-%s%n", key, names.get(key));
        }

        Map<User, Integer> users = new TreeMap<>();
        users.put(new User(5, "Viktorija"), 50);
        users.put(new User(15, "Zita"), 70);
        users.put(new User(17, "Vita"), 20);
        users.put(new User(16, "Gita"), 60);
        users.put(new User(15, "Zita"), 70);

        users.forEach((k, v) -> System.out.printf("%s-%s%n", k, v));

    }
    private void iteratorExample(){
        Map<Integer, String> names = new HashMap<>();
        names.put(8, "Vilda");
        names.put(28, "Rita");
        names.put(18, "Sveta");
        names.put(38, "Valeta");
        names.put(48, "Gilda");

        Iterator<Integer> iterator = names.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.printf("%s-%s%n", key, names.get(key));
        }

        Iterator<Map.Entry<Integer, String>> secondIterator = names.entrySet().iterator();
        while(secondIterator.hasNext()){
            Map.Entry<Integer, String> entry = secondIterator.next();
            System.out.printf("%s-%s%n", entry.getKey(), entry.getValue());
        }
    }
}
