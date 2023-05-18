package lt.codeacademy.first.project.examples.inheritance.interfaces.task;

public interface LandVehicle extends Vehicle{

    int getNumbWheels();

    void setNumbWheels(int numbOfWheels);

    void drive();
}