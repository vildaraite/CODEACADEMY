package lt.codeacademy.first.project.examples.inheritance.interfaces.task;

import java.util.ArrayList;
import java.util.List;

public class MainVehicle {
    public static void main(String[] args) {

        Frigate frigate = new Frigate(50, "Testukas", 15, 20);
        Hovercraft hovercraft= new Hovercraft(6, 20, "Buratinas", 10, 12);
        Jeep jeep = new Jeep("Jeep", 4, 4, 180);

        SeaVehicle frigate2 = new Frigate(20, "Frigata", 12, 18);

        LandVehicle jeep2 = new Jeep("Jeep", 4, 4, 180);
        Vehicle jeep3 = new Jeep("Jeep", 4, 4, 180);

        List<Vehicle> vechiles = new ArrayList<>();
        vechiles.add(frigate);
        vechiles.add(hovercraft);
        vechiles.add(jeep);
        vechiles.add(jeep2);
        vechiles.add(jeep3);
        vechiles.add(frigate2);

        MainVehicle main = new MainVehicle();
        main.printInfo(vechiles);
    }

    private void printInfo(List<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles){
            System.out.printf("%s, %s, %s, %s%n", vehicle.getClass().getSimpleName(), vehicle.getName(), vehicle.getMaxPassengers(), vehicle.getMaxSpeed());
            if(vehicle instanceof Jeep jeep) {
                System.out.println(jeep.getNumbWheels());
                jeep.drive();
            }
            if(vehicle instanceof SeaVehicle seaVehicle) {
                System.out.println(seaVehicle.getDisplacement());
                seaVehicle.launch();
            }
        }
    }
}

