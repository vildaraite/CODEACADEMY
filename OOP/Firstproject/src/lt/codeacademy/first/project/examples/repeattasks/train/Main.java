package lt.codeacademy.first.project.examples.repeattasks.train;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Transport train = new Train(20);
        Scanner sc = new Scanner(System.in);

        String action;
        do {
            main.menu();
            action = sc.nextLine();
            main.userSelection(action, sc, train);
        } while(!action.equals("6"));
    }

    private void userSelection(String action, Scanner sc, Transport train) {
        switch(action) {
            case "1" -> addCustomerToTrain(sc, train);
            case "2" -> train.startMoving();
            case "3" -> train.stopMoving();
            case "4" -> removePassengers(sc, train);
            case "5" -> train.printPassengers();
            case "6" -> System.out.println("Programa baige darba");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void addCustomerToTrain(Scanner scanner, Transport transport) {
        int number = getCorrectNumber(scanner, "Kiek keleiviu laipinsite?");
        int availableSeats = transport.getAvailableSeats();

        if(number > availableSeats) {
            System.out.printf("Sorry, ilaipinsim tik %s keleivius%n", availableSeats);
            number = availableSeats;
        }

        try {
            for(int i = 0; i < number; i++) {
                System.out.printf("Iveskite %s keleivi:%n", i + 1);
                Passenger passenger = createPassenger(scanner);
                transport.addPassenger(passenger);
            }
        } catch(TrainException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void removePassengers (Scanner sc, Transport transport) {
        System.out.println("Iveskite islipimo stotele:");
        String destination = sc.nextLine();

        try {
            transport.removePassenger(destination);
        } catch (TrainException e) {
            System.out.println(e.getMessage());
        }

        transport.removePassenger(destination);
    }

    private Passenger createPassenger(Scanner sc) {
        System.out.println("Iveskite varda");
        String name = sc.nextLine();
        System.out.println("Iveskite pavarde");
        String surname = sc.nextLine();
        System.out.println("Iveskite keliones tiksla");
        String destination = sc.nextLine();

        return new Passenger(name, surname, destination);
    }

    private int getCorrectNumber(Scanner sc, String text) {
        while(true) {
            try {
                System.out.println(text);
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Bloga ivestis");
            }
        }
    }

    private void menu() {
        System.out.println("""
           1. Ilaipinti keleivius
           2. Pradeti vaziuoti
           3. Sustoti
           4. Islaipinti keleivius
           5. Keleiviu sarasas
           6. Exit
								   """);
    }
}