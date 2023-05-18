package lt.codeacademy.first.project.examples.repeattasks;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(new Date(2022,6,28), "Andrius", "VDU", "IF-9999999");
        student.printUniversity();
        student.getDate().printSecond();
        student.getDate().print();

    }
}
