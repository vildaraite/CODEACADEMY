package lt.codeacademy.first.project.examples.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Andrius", "Jonas", "Antanasa");

        // 1. streamas is collection
        Stream<String> streamOfNames = names.stream();

        // 2. naudojant Stream of metoda
        Stream<Integer> integerStream = Stream.of(5,4,5,8);

        //3.from array;
        int[] mas = {8,8,8,5};
        String[] mas2 = {"test", "test2"};
        IntStream integerStream1 = Arrays.stream(mas);
        Stream<String> words = Arrays.stream(mas2);

        //4. naudojant buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            Stream<String> lines = br.lines();
        } catch(IOException e) {

        }

        StreamExample example = new StreamExample();
        List<User> users = List.of(new User("Andrius", "Baltrunas"),
                new User("Petras", "Petraitis"),
                new User("Jonas", "Jonaitis"),
                new User("Jokubas", "Naujas"),
                new User("Ona", "Onaite"));


        Consumer<User> consumer = example.print();
        //Consumer<User> consumer = example::print;
        Consumer<User> consumer2 = example::print2;
        //users.forEach(consumer);
		/*users.forEach(user -> {
			String name = user.name();
			String surname = user.surname();
			System.out.printf("%s %s%n", name, surname);
		});*/
        users.forEach(consumer2);

        List<String> collectedNames = users.stream()
                .filter(user -> user.name().length() >= 6)
                .map(User::name)
                .sorted(String::compareTo)
                .toList();

        System.out.println("------------------");
        collectedNames.forEach(System.out::println);

        List<Person> persons = users.stream()
                //.map(u -> new Person(u.name() + " " + u.surname()))
                .map(u-> u.name() + " " + u.surname())
                //.map(u -> new Person(u))
                .map(Person::new)
                .toList();
    }

    private void print2(User user) {
        String name = user.name();
        String surname = user.surname();
        System.out.printf("%s %s%n", name, surname);
    }

    private void print(User user) {
        System.out.printf("%s %s%n", user.name(), user.surname());
    }

    private Consumer<User> print() {
        return user -> System.out.printf("%s %s%n", user.name(), user.surname());
    }
}