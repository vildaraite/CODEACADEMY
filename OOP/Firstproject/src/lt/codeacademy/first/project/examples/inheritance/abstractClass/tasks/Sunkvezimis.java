package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;

import java.time.LocalDate;

public class Sunkvezimis extends Transportas{
    private final double maxWeight;

    public Sunkvezimis(LocalDate registrationDate, double maxWeight, String color) {
        super(registrationDate, color);
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void go() {
        System.out.println("Sukvezimis vaziuoja");
    }
}