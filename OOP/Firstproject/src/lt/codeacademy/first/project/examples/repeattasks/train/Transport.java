package lt.codeacademy.first.project.examples.repeattasks.train;

import java.util.HashSet;
import java.util.Set;

abstract class Transport {

    protected final Set<Passenger> passengers;
    private final int maxSeats;
    protected TrainState state;

    Transport(int maxSeats) {
        this.maxSeats = maxSeats;
        state = TrainState.STOPPED;
        passengers = new HashSet<>();
    }

    abstract void addPassenger(Passenger passenger);
    abstract void removePassenger(String destination);

    abstract void printPassengers();

    void startMoving() {
        if(state.equals(TrainState.MOVING)) {
            System.out.println("Transporto priemone vaziuoja");
        }
    }

    void stopMoving() {
        state = TrainState.STOPPED;
        System.out.println("Transporto priemone stovi");
    }

    boolean isTransportFull() {
        return maxSeats == passengers.size();
    }

    int getAvailableSeats (){
        return maxSeats - passengers.size();
    }
}