package lt.codeacademy.first.project.examples.inheritance.abstractClass.tasks;
import java.time.LocalDate;

public class AutoMain {
    public static void main(String[] args) {
        Transportas t = new Automobilis(LocalDate.of(2022, 10,02), 55.5, "raudona");
        t.printRegistrationDate();
        t.go();

        Transportas t1 = new Sunkvezimis(LocalDate.of(2000, 11, 29), 8000, "pilka");
        t1.printRegistrationDate();
        t1.go();

    }
}