package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

public class Student extends Person {

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

}
