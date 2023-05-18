package lt.codeacademy.first.project.examples.inheritance.interfaces.task;

public class Frigate implements SeaVehicle {
    private int displacement;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Frigate(int displacement, String name, int maxPassengers, int maxSpeed) {
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void fireGun() {
        System.out.println("Booom");
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Launching......");
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
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }
}