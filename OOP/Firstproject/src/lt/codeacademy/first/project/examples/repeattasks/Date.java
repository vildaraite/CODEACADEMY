package lt.codeacademy.first.project.examples.repeattasks;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        try {
            Month m = Month.getMonth(month, day);
            System.out.printf("%s-%s-%s%n", year, m.getNumber(), day);
        }catch(DateFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public void printSecond() {
        try
        {
            LocalDate date = LocalDate.of(year, month, day);

            System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }catch(DateTimeException e) {
            System.out.println("Blogas datos formatas");
        }
    }
}

