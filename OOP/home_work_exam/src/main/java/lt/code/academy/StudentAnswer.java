package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAnswer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter Your surname: ");
        String surname = sc.nextLine();
        System.out.println("Please enter Your ID number: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter Your exam subject (MATH, CHEMISTRY, PROGRAMMING): ");
        String subject = sc.nextLine();
        System.out.println("Please enter Your exam ID number: ");
        int examId = Integer.parseInt(sc.nextLine());
        int[] examAnswers = new int[10];

        for (int i = 0; i < examAnswers.length; i++) {
            System.out.println("Enter exam answer (1, 2 or 3) #" + (i + 1) + ": ");
            examAnswers[i] = sc.nextInt();
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //Student student = new Student(name, surname, id));




        File file = new File("student_answers.json");
        if(!file.exists()) {
            file.createNewFile();
        }

        mapper.writeValue(file, student);


        }


    }
