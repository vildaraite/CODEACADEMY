package lt.codeacademy.first.project.examples.files;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname) {
        this(name, surname, 0);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}