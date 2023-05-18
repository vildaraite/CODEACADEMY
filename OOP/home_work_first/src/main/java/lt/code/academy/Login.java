package lt.code.academy;

/*

import lt.code.academy.object.Exam;
import lt.code.academy.object.Student;
import org.apache.commons.codec.digest.DigestUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Login {
   private  List<Student> students;
    private final LoginWriterReader loginWriterReader;

    public Login() {
        loginWriterReader = new LoginWriterReader();
       // students = loginWriterReader.getStudents();
    }
*/
/*
   // public static void main(String[] args) {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        String line;
       // do {
            login.menu();
            line = sc.nextLine();
            login.studentSelection(sc, line);
      //  } while (!line.equals("4"));
    }*//*


    private void studentSelection(Scanner sc, String action) {
        switch (action) {
            case "1" -> identity(sc, loginWriterReader);
            case "2" -> registration(sc);
            case "3" -> login(sc);
            case "4" -> login(sc);
            case "5" -> {
               // loginWriterReader.saveStudents(students);
                System.out.println("You have exited the login program!");
            }
            default -> System.out.println("This action oes not exist!");
        }
    }

    private void readyForExam (Scanner scanner) {



    }

    private void createExam (Scanner scanner) {
        System.out.println("Please write exam ID: ");
        int id = scanner.nextInt();

        System.out.println("Please write exam subject: ");
        String examSubject = scanner.nextLine();

        System.out.println("Please enter exam topic: ");
        String examTopic = scanner.nextLine();

        LocalDateTime examDate = LocalDateTime.now();

        //Exam exam = new Exam(id, examSubject, examTopic);

    }

    private void login(Scanner sc) {
        System.out.println("Please write Your username");
        String username = sc.nextLine();
       // Students student = students.get(username);
        boolean student;
        if (student == null) {
            System.out.println("This user does not exist. Please press registration button ");
        return;
    }


        System.out.println("Please write your password");
        String password = sc.nextLine();
        if(!student.password().equals(DigestUtils.sha512Hex(password))) {
            System.out.println("Password is incorrect");
            return;
        }

        System.out.printf("Welcome %s %s%n", student.name(), student.surname());
    }

    private void registration(Scanner scanner) {
        Students student;
        String userName;
        do {
            System.out.println("Please write Your username");
            userName = scanner.nextLine();
            student = students.get(userName);
            if(student != null) {
                System.out.println("User already exist");
            }
        } while(student != null);

        System.out.println("Please write Your name ");
        String name = scanner.nextLine();
        System.out.println("Please write Your surname");
        String surname = scanner.nextLine();
        System.out.println("Please write Your password");
        String password = scanner.nextLine();

        String repeatPassword;
        do {
            System.out.println("Please repeat password");
            repeatPassword = scanner.nextLine();
        } while(!repeatPassword.equals(password));

        student = new Students(userName, name , surname, DigestUtils.md5Hex(password));
        students.put(userName, student);

        System.out.println("Registration successful!");
    }

    private void identity(Scanner sc, LoginWriterReader students) {
        String professorUsername = "vilda";
        String professorPassword = "maladec";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (username.equals(professorUsername) && password.equals(professorPassword)){
            System.out.println("Welcome, Professor!");
            // cia nelabai aisku ar teisingai padarei
        }else if (username.equals(students.getStudents())) {
            System.out.printf("Welcome, %s student!", username);
        }else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private void menu() {
        System.out.println("""
								   1. Identity confirmation
								   2. Registration
								   3. Login
								   4. Press this button if You are ready for exam
								   5. Exit
								   """);
    }
}*/
