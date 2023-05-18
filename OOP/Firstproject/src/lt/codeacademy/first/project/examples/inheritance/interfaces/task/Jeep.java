package lt.codeacademy.first.project.examples.inheritance.interfaces.task;

public class Jeep implements LandVehicle {
    private String name;
    private int numbOfWheels;
    private int passengers;
    private int speed;

    public Jeep(String name, int numbOfWheels, int passengers, int speed) {
        this.name = name;
        this.numbOfWheels = numbOfWheels;
        this.passengers = passengers;
        this.speed = speed;
    }

    public void soundHorn() {
        System.out.println("Pyyyyyyyypppppp");
    }

    @Override
    public int getNumbWheels() {
        return numbOfWheels;
    }

    @Override
    public void setNumbWheels(int numbOfWheels) {
        this.numbOfWheels = numbOfWheels;
    }

    @Override
    public void drive() {
        System.out.printf("%s vairuoja masina%n", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return passengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        passengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.speed = speed;
    }
}
