package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.object.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentFile {

    private int id;

    private String userName;
    private String name;

    private String surname;

    private String fileWithStudent = "jsonFiles\\fileWithStudents\\students.json";

    List<Student> students = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentFile sf= new StudentFile();
        Scanner scanner = new Scanner(System.in);

        sf.newStudent(scanner);
        System.out.println(sf.newStudent(scanner));
    }

    public boolean newStudent(Scanner scanner) {
        System.out.println("Please write Your student ID: ");
        id = scanner.nextInt();
        System.out.println("Please write Your username: ");
        userName = scanner.nextLine();
        System.out.println("Please write Your name: ");
        name = scanner.nextLine();
        System.out.println("Please write Your surname: ");
        surname = scanner.nextLine();

        //students.add(new Student(id, userName, name, surname));

        return false;
    }

    public void toFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String aboutStudent;

        for (Student student : students) {
            aboutStudent = student.getId() + student. getName() + student.getSurname();
            File file = new File(fileWithStudent);
            if (!file.exists()) {
                file.createNewFile();
            }

            mapper.writeValue(file, aboutStudent);
        }
    }
}

