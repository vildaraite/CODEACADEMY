package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.data.Exam;
import lt.code.academy.data.Student;
import lt.code.academy.data.StudentAnswer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentAnswerWriter {

    public static void main(String[] args) throws IOException {

        //Student student = new Student(1, "Vilda", "Beizaraite", new Exam(111, "English", "Grammar"), List.of(new StudentAnswer(1, "A"), new StudentAnswer(2, "C"), new StudentAnswer(3, "B"), new StudentAnswer(4, "B"), new StudentAnswer(5, "A")));
       // Student secondStudent = new Student(2, "Lukas", "Beizaras", new Exam(111, "English", "Grammar"), List.of(new StudentAnswer(1, "C"), new StudentAnswer(2, "C"), new StudentAnswer(3, "B"), new StudentAnswer(4, "B"), new StudentAnswer(5, "C")));
       // Student thirdStudent = new Student(3, "Simonas", "Beizaras", new Exam(111, "English", "Grammar"), List.of(new StudentAnswer(1, "B"), new StudentAnswer(2, "B"), new StudentAnswer(3, "B"), new StudentAnswer(4, "B"), new StudentAnswer(5, "C")));


        Scanner sc = new Scanner(System.in);

        System.out.println("ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("vardas");
        String name = sc.nextLine();
        System.out.println("pavarde");
        String surname = sc.nextLine();


    //Student student1 = new Student(student.setId(id), student.setName(name),student.setSurname(surname), new Exam(1, "English", "Grammar"), List.of(new StudentAnswer(1, "A"), new StudentAnswer(2, "B"), new StudentAnswer(3, "C")));
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        File file = new File("JsonFiles\\studentAnswerCatalogue\\student_one_answer.json");
        if (!file.exists()) {
            file.createNewFile();
        }

       //mapper.writeValue(file, student1);



        File fileTwo = new File("jsonFiles\\studentAnswerCatalogue\\student_two_answer.json");
        if (!fileTwo.exists()) {
            fileTwo.createNewFile();
        }

        //mapper.writeValue(fileTwo, secondStudent);


        File fileThree = new File("jsonFiles\\studentAnswerCatalogue\\student_three_answer.json");
        if (!fileThree.exists()) {
            fileThree.createNewFile();
        }

        //mapper.writeValue(fileThree, thirdStudent);

    }
}
