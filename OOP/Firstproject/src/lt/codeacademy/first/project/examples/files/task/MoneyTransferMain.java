package lt.codeacademy.first.project.examples.files.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MoneyTransferMain {
    private static final String PERSON_FILE_NAME = "people.txt";
    private static final String PAYMENT_FILE_NAME = "payment.txt";
    private static final String ID = "id";
    private static final String REGEX = ",";

    private final Map<Integer, Person> persons = new HashMap<>();
    private final Set<Payment> payments = new TreeSet<>();

    public static void main(String[] args) {
        MoneyTransferMain main = new MoneyTransferMain();
        main.fillUpPersons();
        main.readPayments();
        main.writeMostReceivedMoneyPersons();
        main.writeMostSentMoneyPersons();

        // visada kai darome meniu naudojame do while
        //while skiltyje padarome kol action'as nelygus penkiems do ir virsutineje dalyje parasome ka darome
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            main.menu();
            action = scanner.nextLine();
            main.userSelection(action);
        } while (!action.equals("5"));
    }

    private void fillUpPersons() {
        try (BufferedReader br = new BufferedReader(new FileReader(PERSON_FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(ID)) {
                    continue;
                }

                String[] splits = line.split(REGEX);
                if (splits.length < 3) {
                    continue;
                }

                int id = Integer.parseInt(splits[0]);
                if (persons.get(id) == null) {
                    persons.put(id, new Person(id, splits[1].trim(), splits[2].trim()));
                }
            }
        } catch (IOException e) {
            System.out.printf("Cannot read file %s, reason:%s%n", PERSON_FILE_NAME, e.getMessage());
        }
    }

    private void readPayments() {
        List<Integer> transactions = new ArrayList<>();
        try (BufferedReader bw = new BufferedReader(new InputStreamReader(new FileInputStream(PAYMENT_FILE_NAME)))) {
            String line;
            while ((line = bw.readLine()) != null) {
                if (line.startsWith(ID)) {
                    continue;
                }

                String[] splits = line.split(REGEX);
                if (splits.length < 4) {
                    continue;
                }

                int id = Integer.parseInt(splits[0]);
                if (transactions.contains(id)) {
                    continue;
                }

                transactions.add(id);

                int sum = Integer.parseInt(splits[1].trim());
                int senderId = Integer.parseInt(splits[3].trim());
                int receiverId = Integer.parseInt(splits[2].trim());

                addSentMoney(sum, senderId);
                addReceivedMoney(sum, receiverId);

                payments.add(new Payment(id, sum, receiverId, senderId));
            }
        } catch (IOException e) {
            System.out.printf("Cannot read file %s, reason: %s%n", PAYMENT_FILE_NAME, e.getMessage());
        }
    }

    private void addSentMoney(int sum, int senderId) {
        Person sender = persons.get(senderId);
        if (sender != null) {
            sender.increaseSentMoneyCount();
            sender.setSentMoney(sender.getSentMoney() + sum);
        }
    }

    private void addReceivedMoney(int sum, int receivePersonId) {
        Person person = persons.get(receivePersonId);
        if (person != null) {
            person.increaseReceivedMoney();
            person.setReceivedMoney(person.getReceivedMoney() + sum);
        }
    }

    private void writeMostReceivedMoneyPersons() {
        List<Person> sortedPersons = new ArrayList<>(persons.values());
        sortedPersons.sort(Comparator.comparingInt(Person::getReceivedMoney).reversed());
        writePersons(sortedPersons, "sorted_by_received_money.txt");
    }

    private void writeMostSentMoneyPersons() {
        List<Person> sortedPersons = new ArrayList<>(persons.values());
        sortedPersons.sort(Comparator.comparingInt(Person::getSentMoney));
        writePersons(sortedPersons, "sorted_by_sent_money.txt");
    }

	/*private Comparator<Person> SORT_BY_RECEIVED_MONEY_ASC = (o1, o2) -> {
		return Integer.compare(o2.getReceivedMoney(), o1.getReceivedMoney());
	};*/
    //private Comparator<Person> SORT_BY_RECEIVED_MONEY_ASC = (o1, o2) -> Integer.compare(o2.getReceivedMoney(), o1.getReceivedMoney());
    //private Comparator<Person> SORT_BY_RECEIVED_MONEY_ASC = Comparator.comparingInt(Person::getReceivedMoney).reversed();

    private void writePersons(List<Person> persons, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("id, name, surname, received money, sent money");
            for (Person p : persons) {
                bw.newLine();
                bw.write(p.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void userSelection(String action) {
        switch (action) {
            case "1" -> printMostSentMoneysPerson();
            case "2" -> printMostReceivedMoneyCountPerson();
            case "3" -> printPaymentPersonByIndex(0);
            case "4" -> printPaymentPersonByIndex(payments.size() - 1);
            case "5" -> System.out.println("Viso gero");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void printMostSentMoneysPerson() {
        Person person = null;
        for (Person p : persons.values()) {
            if (person != null && person.getCountSentMoney() >= p.getCountSentMoney()) {
                continue;
            }
            person = p;
        }

        if (person != null) {
            System.out.printf("%s %s atliko %s pervedimu%n", person.getName(), person.getSurname(), person.getCountSentMoney());
        }
    }

    private void printMostReceivedMoneyCountPerson() {
        List<Person> sortedPersons = new ArrayList<>(persons.values());
        sortedPersons.sort(Comparator.comparingInt(Person::getCountReceivedMoney).reversed());
        if (sortedPersons.isEmpty()) {
            return;
        }
        Person person = sortedPersons.get(0);

        System.out.printf("%s %s gavo daugiausiai %s pavedimu%n", person.getName(), person.getSurname(), person.getCountReceivedMoney());
    }

    private void printPaymentPersonByIndex(int index) {
        List<Payment> tempPayments = new ArrayList<>(payments);
        if (tempPayments.isEmpty()) {
            return;
        }

        Payment payment = tempPayments.get(index);
        Person sender = persons.get(payment.senderId());
        Person receiver = persons.get(payment.receiverId());

        if (sender == null || receiver == null) {
            return;
        }

        System.out.printf("Siuntejas: %s %s, siunte: %s, gavejas: %s %s%n", sender.getName(), sender.getSurname(), payment.sum(), receiver.getName(), receiver.getSurname());
    }

    private void menu() {
        System.out.println("""
                   1.Atvaizduoti vartotoją kuris padarė daugiausiai pervedimų ir kiek jų padarė.
                   2.Atvaizduoti vartotoją kuris gavo daugiausiai pervedimų ir kiek jų gavo.
                   3.Atvaizduoti didžiausia pervedimą.Kas siuntė, kiek siunte ir kas gavo.
                   4.Atvaizduoti mažiausia pervedimą.Kas siuntė, kiek siunte ir kas gavo.
                   5.Exit			            
                """);
    }
}
