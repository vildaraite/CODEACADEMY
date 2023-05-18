package lt.codeacademy.first.project.examples.repeattasks.train;

import java.util.Iterator;

public class Train extends Transport {
    public Train(int maxSeats) {
        super(maxSeats);
    }

    @Override
    void addPassenger(Passenger passenger) {
        if(state.equals(TrainState.MOVING)) {
            throw new TrainException("Negalima prideti keleivio, nes traukinys juda");
        }

        if(isTransportFull()) {
            throw new TrainException("Negalime prideti keleivio, nes taukinys pilnas");
        }

        passengers.add(passenger);
    }

    @Override
    void removePassenger(String destination) {
        if (state.equals(TrainState.MOVING)) {
            throw new TrainException("Negalime islaipinti is judancio traukiio");
        }
        // taisyklingas isvalymas listo, ciklo viduje
        Iterator<Passenger> iterator = passengers.iterator();
        while(iterator.hasNext()){
            Passenger passenger = iterator.next();
            if (passenger.getDestination().equals(destination)){
                iterator.remove();
            }
        }

    }

    @Override
    void printPassengers() {
        if(passengers.isEmpty()){
            System.out.println("Keleiviu nera");
            return;
        }

        for (Passenger p : passengers){
            System.out.println(p);
        }
    }
}