package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

public class Teacher extends Person {

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }
}

