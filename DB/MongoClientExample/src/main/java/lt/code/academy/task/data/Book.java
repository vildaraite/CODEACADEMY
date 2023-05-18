package lt.code.academy.task.data;

import org.bson.types.ObjectId;

public class Book {
    private ObjectId id;
    private String title;
    private String author;
    private String isbn;
    private int publishYear;
    private Reservation reservation;

    public Book() {}

    public Book(ObjectId id, String title, String author, String isbn, int publishYear, Reservation reservation) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.reservation = reservation;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishYear=" + publishYear +
                ", reservation=" + reservation +
                '}';
    }
}