package lt.code.academy.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.StudentAnswer;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAnswersFromAnotherProject {
    public static void main(String[] args) throws IOException {

        StudentAnswer studentAnswer = new StudentAnswer();


        // List<String> answers = new ArrayList<>();

        String username;
        String name;
        String surname;
        String password;

        Scanner scanner = new Scanner(System.in);



        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File ("student_list.json");

        if (!file.exists()) {
            file.createNewFile();
        }


    }



    private Map<Integer, String> studentFillItUp() {

        Map<Integer, String> answers = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Write question 1 answer (a,b,c):");
        answers.put(1, sc.nextLine());

        System.out.println("Write question 2 answer (a,b,c):");
        answers.put(2, sc.nextLine());

        System.out.println("Write question 3 answer (a,b,c):");
        answers.put(3, sc.nextLine());

        System.out.println("Write question 4 answer (a,b,c):");
        answers.put(4, sc.nextLine());

        System.out.println("Write question 5 answer (a,b,c):");
        answers.put(5, sc.nextLine());


        return answers;
    }


    private void chooseSubject () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Your exam subject // math // english // chemistry");
        String subject = sc.nextLine();
        System.out.println("Write exam ID:");
        int id = Integer.parseInt(sc.nextLine());
    }

    private void identityCheckIn () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your username:");
        String username = sc.nextLine();
        System.out.println("Write your name:");
        String name = sc.nextLine();
        System.out.println("Write your surname:");
        String surname = sc.nextLine();
        System.out.println("Write your password:");
        String password = sc.nextLine();
    }
}

}
