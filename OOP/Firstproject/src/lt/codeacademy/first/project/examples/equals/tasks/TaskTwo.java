package lt.codeacademy.first.project.examples.equals.tasks;

import lt.codeacademy.first.project.examples.data.Person;

public class TaskTwo {
    public static void main(String[] args) {
        TaskTwo person = new TaskTwo();
        TaskTwo tank = new TaskTwo();

        System.out.println(person == tank);
        System.out.println(person.equals(tank));

        person = tank;

        System.out.println(person == tank);
    }
}
