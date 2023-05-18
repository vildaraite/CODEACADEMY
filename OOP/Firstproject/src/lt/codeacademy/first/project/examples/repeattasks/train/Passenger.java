package lt.codeacademy.first.project.examples.repeattasks.train;

public class Passenger {
    private final String name;
    private final String surname;
    private final String destination;

    public Passenger(String name, String surname, String destination) {
        this.name = name;
        this.surname = surname;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public String getDestination() {
        return destination;
    }
}
