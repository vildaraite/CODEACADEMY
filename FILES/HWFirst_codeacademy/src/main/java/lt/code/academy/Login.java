package lt.code.academy;

import lt.code.academy.data.Exam;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Login {


        public static void main (String[]args){
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        String line;
        do {
            login.menu();
            line = sc.nextLine();
            login.userSelection(sc, line);
        } while (!line.equals("3"));
    }

        private void userSelection (Scanner sc, String action){
        switch (action) {
            case "1" -> registration();
            case "2" -> System.out.println();
            case "3" -> {
                System.out.println("Programa baige darba");
            }
            default -> System.out.println("Tokio veiksmo nera!");
        }
    }



    private void registration(){
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        int id;

        System.out.print("Enter student's first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter student's last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter student's id: ");
        id = scanner.nextInt();

        scanner.nextLine();


        // Write student registration data to a file
        try {
            File file = new File("students.json");
            if (!file.exists()){
            file.createNewFile();
            }
            System.out.println("Student Registration Details saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }


        private void menu () {
        System.out.println("""
                [1]. Registration
                [2]. Login
                [3]. Exit
                """);
    }
    }