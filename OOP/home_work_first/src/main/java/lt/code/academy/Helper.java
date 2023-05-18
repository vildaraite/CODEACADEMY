package lt.code.academy;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.object.Exam;
import lt.code.academy.object.Student;
import lt.code.academy.object.StudentAnswer;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Helper {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite studento ID: ");
        String id = scanner.nextLine();

        System.out.println("Iveskite studento varda: ");
        String name = scanner.nextLine();

        System.out.println("Iveskite studento pavarde: ");
        String surname = scanner.nextLine();


        System.out.println("Iveskite egzamino id: ");
        String examId = scanner.nextLine();

        System.out.println("Iveskite egzamino dalyko pavadinima: ");
        String examSubject = scanner.nextLine();

        System.out.println("Iveskite egzamino tema: ");
        String examTopic = scanner.nextLine();


        System.out.println("Iveskite 1 klausimo atsakyma: ");
        String answerOne = scanner.nextLine();

        System.out.println("Iveskite 2 klausimo atsakyma ");
        String answerTwo = scanner.nextLine();

        System.out.println("Iveskite 3 klausimo atsakyma ");
        String answerThree = scanner.nextLine();

        System.out.println("Iveskite 4 klausimo atsakyma ");
        String answerFour = scanner.nextLine();

        System.out.println("Iveskite 5 klausimo atsakyma ");
        String answerFive = scanner.nextLine();

        List<String> studentAnswerList = new ArrayList<>();
        studentAnswerList.add(answerOne);
        studentAnswerList.add(answerTwo);
        studentAnswerList.add(answerThree);
        studentAnswerList.add(answerFour);
        studentAnswerList.add(answerFive);


        Student student = new Student(id, name, surname, new Exam(examId, examSubject, examTopic), (StudentAnswer) studentAnswerList);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("jsonFiles\\studentAnswerCatalogue\\student_answer.json");
        if(!file.exists()) {
            file.createNewFile();
        }

        mapper.writeValue(file, student);


        }



        }





