package lt.codeacademy.first.project.examples.collection.map.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FourthTask {
    private final Map<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        FourthTask task = new FourthTask();
        Scanner scanner = new Scanner(System.in);

        String action;
        do {
            task.menu();
            action = scanner.nextLine();
            task.userAction(action, scanner);
        } while(!action.equals("3"));
    }

    private void userAction(String action, Scanner sc) {
        switch(action){
            case "1" -> addNewStudent(sc);
            case "2" -> findStudent(sc);
            case "3" -> System.out.println("Programa baigia darba");
            default -> System.out.println("Tokio pasirinkimo nera");
        }
    }

    private void addNewStudent(Scanner sc) {
        System.out.println("Iveskite studento varda");
        String name = sc.nextLine();
        System.out.println("Iveskite studento pavarde");
        String surname = sc.nextLine();
        System.out.println("Iveskite studento nr.");
        String nr = sc.nextLine();
        System.out.println("Iveskite studento universiteta");
        String university = sc.nextLine();

        students.put(nr, new Student(name, surname, university));
    }

    private void findStudent(Scanner sc) {
        System.out.println("Iveskite studento nr.");
        String nr = sc.nextLine();
        Student student = students.get(nr);

        if(student == null) {
            System.out.printf("Tokio studento pagal paduota id:%s nera%n", nr);
            return;
        }

        System.out.printf("%s -> %s%n", nr, student);
    }

    private void menu() {
        System.out.println("""
								[1] – įvesti studentą
								[2] – gauti studentą pagal numerį
								[3] – baigti programą              
								   """);
    }
}

