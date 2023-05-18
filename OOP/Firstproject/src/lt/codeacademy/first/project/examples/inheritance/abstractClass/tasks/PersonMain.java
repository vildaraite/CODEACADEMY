package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person student = new Student("Jonas", "Jonaitis");
        student.printInfo();

        Person teacher = new Teacher("Petras", "Petraitis");
        teacher.printInfo();

        Student secondStudent = new Student("Jonas", "Jonaitis");

        List<Person> persons = List.of(student, teacher, secondStudent);
        System.out.println(secondStudent.isValuesUnique(persons));

    }
}

