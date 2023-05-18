package lt.code.academy.task;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.client.MongoIterable;
import static com.mongodb.client.model.Updates.*;
import lt.code.academy.client.MongoObjectClientProvider;
import lt.code.academy.task.data.Address;
import lt.code.academy.task.data.Book;
import lt.code.academy.task.data.Reservation;
import lt.code.academy.task.data.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LibraryApplication {
    private final MongoCollection<User> userCollection;
    private final MongoCollection<Book> bookCollection;
    private User user;

    public LibraryApplication(MongoCollection<User> userCollection, MongoCollection<Book> bookCollection) {
        this.userCollection = userCollection;
        this.bookCollection = bookCollection;
    }

    public static void main(String[] args) {
        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("library");
        LibraryApplication application = new LibraryApplication(database.getCollection("users", User.class),
                database.getCollection("books", Book.class));

        //application.createBooks();
        //application.createUsers();
        Scanner scanner = new Scanner(System.in);

        application.login(scanner);

        String action;
        do {
            application.menu();
            action = scanner.nextLine();
            application.userSelection(scanner, action);
        } while(!action.equals("5"));
    }

    private void login(Scanner sc) {
        do {
            System.out.println("Prasome prisijungti");

            System.out.println("Iveskite varda:");
            String name = sc.nextLine();

            System.out.println("Iveskite pavarde:");
            String surname = sc.nextLine();

            user = userCollection.find(and(eq("name", name), eq("surname", surname))).first();
            if(user == null) {
                System.out.println("Tokio userio nera.");
            }

        } while(user == null);
    }

    private void userSelection(Scanner scanner, String action) {
        switch(action) {
            case "1" -> orderBook(scanner);
            case "2" -> showAvailableBooks();
            case "3" -> showReservedBooks();
            case "4" -> System.out.println("4");
            case "5" -> System.out.println("Programa baigia darba");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void orderBook(Scanner scanner) {
        System.out.println("Iveskite norimos knigos pavadinima:");
        String title = scanner.nextLine();
        System.out.println("Iveskite knygos autoriu:");
        String author = scanner.nextLine();

        Book book = bookCollection.find(and(eq("title", title), eq("author", author))).first();
        if(book == null) {
            System.out.println("Tokios knygos nera");
            return;
        }

        LocalDateTime currentDate = LocalDateTime.now();
        Reservation reservation = new Reservation(user.getName(), user.getSurname(), currentDate, currentDate.plusDays(7));

        bookCollection.updateOne(eq("_id", book.getId()), set("reservation", reservation));
    }

    private void showAvailableBooks() {
        FindIterable<Book> books = bookCollection.find(eq("reservation", null));
        for(Book book : books) {
			/*if(book.getReservation() == null) {
				System.out.printf("%s %s %s%n",book.getTitle(), book.getAuthor(), book.getPublishYear());
			}*/
            System.out.printf("%s %s %s%n",book.getTitle(), book.getAuthor(), book.getPublishYear());
        }
    }

    private void showReservedBooks() {
        FindIterable<Book> books = bookCollection.find(not(eq("reservation", null)));
        for(Book book: books) {
            System.out.printf("%s %s %s %s %s%n", book.getTitle(), book.getAuthor(), book.getReservation().getName(), book.getReservation().getSurname(), book.getReservation().getReturnDate());
        }
    }

    private void menu() {
        System.out.println("""
           1. Uzsisakyti knyga
           2. Ziureti laisvas knygas
           3. Perziureti paiimtas knygas
           4. Pratesti knygos grazinima
           5. Iseiti
								   """);
    }

    private void createBooks() {
        List<Book> books = List.of(new Book(null, "Java", "O. Oneal", "jsns854775", 2022, null),
                new Book(null, "C#", "Petraukas", "8888r8r8", 2021, null),
                new Book(null, "Python", "T. Butautas", "99985555", 1999, null),
                new Book(null, "Spring", "J. Kaziukaitis", "qqweqw3eqw", 2020, null),
                new Book(null, "TypeScrip", "N. Petraitis", "dsfsd99641q1", 2023, null));

        bookCollection.insertMany(books);
    }

    private void createUsers() {
        List<User> users = List.of(new User(null, "Andrius", "Baltrunas", "+37058457668", Set.of(new Address("LT", "Kaunas", "Savvanoriu av.", "LT-85555")), null),
                new User(null, "Petras", "Petraitis", "+3705842554", Set.of(new Address("LT", "Vilnius", "Savanoriu av. 122", "LT-99999")), null));

        userCollection.insertMany(users);
    }
}