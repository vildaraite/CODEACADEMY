package lt.code.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private final Map<Integer, Student> students = new HashMap<>();



    public static void main() {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        String line;
        do{
            login.menu();
            line = sc.nextLine();
            login.selection(sc,line);
        }while (!line.equals("4"));


    }
    // dar reikia sugalvoti, kaip irasyti tuos studentus i faila prisiregistravusius

    private void selection (Scanner sc, String action) {
        LoginWriterReader lwr = new LoginWriterReader();
        switch (action) {
            case "1" -> identity(sc, lwr);
            case "2" -> registration(sc);
            case "3" -> login(sc);
            case "4" -> System.out.println("You have exited the login program!");
            default -> System.out.println("This action does not exist!");
        }
    }



    private void login (Scanner sc) {
        System.out.println("Write your id");
        String studentId = sc.nextLine();
        Student student = students.get(studentId);
        if(student == null) {
            System.out.println("This student does not exist, please sign up!");
            return;
        }

        System.out.println("Write password");
        String pass = sc.nextLine();
        if(!studentId.pass()

        private void registration (Scanner scanner) {
            Student student;
            String userName;
            do {
                System.out.println("Write your username:");
                userName = scanner.nextLine();
                student = students.get(userName);
                if (student != null) {
                    System.out.println("You are already in the system");
                }
            }while (student != null);

            System.out.println("Write your id");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Write your name:");
            String name = scanner.nextLine();

            System.out.println("Write your surname:");
            String surname = scanner.nextLine();

            System.out.println("Write your password:");
            String password = scanner.nextLine();

            String repeatPassword;
            do {
                System.out.println("Repeat password:");
                repeatPassword = scanner.nextLine();
            } while (!repeatPassword.equals(password));
            student = new Student(id, name, surname, DigestUtils.sha512_224Hex(password));
            students.put(id, student);


            System.out.printf("Congratulation, %s!%n ", surname);

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


        private void menu () {
            System.out.println("""
                [1]. Identity confirmation
                [2]. Registration
                [3]. Login
                [4]. Exit
                
                """);
        }
    }
}


