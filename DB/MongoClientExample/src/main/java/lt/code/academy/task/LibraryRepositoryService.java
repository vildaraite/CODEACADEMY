package lt.code.academy.task;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lt.code.academy.client.MongoObjectClientProvider;
import lt.code.academy.task.data.Address;
import lt.code.academy.task.data.Book;
import lt.code.academy.task.data.Reservation;
import lt.code.academy.task.data.User;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.not;
import static com.mongodb.client.model.Updates.set;

public class LibraryRepositoryService {
    private final MongoCollection<User> userCollection;
    private final MongoCollection<Book> bookCollection;
    private User user;

    public LibraryRepositoryService() {
        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("library");

        userCollection = database.getCollection("users", User.class);
        bookCollection = database.getCollection("books", Book.class);

        //createBooks();
        //createUsers();
    }

    public User getLoginUser(String name, String surname) {
        user = userCollection.find(and(eq("name", name), eq("surname", surname))).first();

        return user;
    }

    public Book findBook(String title, String author) {
        return bookCollection.find(and(eq("title", title), eq("author", author))).first();
    }

    public void orderBookForUser(Book book){
        LocalDateTime currentDate = LocalDateTime.now();
        Reservation reservation = new Reservation(user.getName(), user.getSurname(), currentDate, currentDate.plusDays(7));

        bookCollection.updateOne(eq("_id", book.getId()), set("reservation", reservation));
        book.setReservation(reservation);

        addBookToUser(book);
    }

    public FindIterable<Book> getAvailableBooks() {
        return bookCollection.find(eq("reservation", null));
    }

    public FindIterable<Book> getReservedBooks() {
        return bookCollection.find(not(eq("reservation", null)));
    }

    public void updateBookReservation(ObjectId id, LocalDateTime returnDate) {
        bookCollection.updateOne(eq("_id", id), set("reservation.returnDate", returnDate));
    }

    private void addBookToUser(Book book) {
        if(user.getBooks() == null) {
            user.setBooks(new HashSet<>());
        }

        user.getBooks().add(book);

        userCollection.updateOne(eq("_id", user.getId()), set("books", user.getBooks()));
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

    public User getUser() {
        return user;
    }
}