package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

import java.time.LocalDate;

public class Automobilis extends Transportas {
    private final double capacity;

    public Automobilis(LocalDate registrationDate, double capacity, String color) {
        super(registrationDate, color);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public void go() {
        System.out.println("Automobilis vaziuoja");
    }
}
