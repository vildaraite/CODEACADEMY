package lt.code.academy;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;
import java.util.Scanner;

public class Login {
    private final Map<String, User> users;
    private final LoginWriterReader loginWriterReader;

    public Login() {
        loginWriterReader = new LoginWriterReader();
        users = loginWriterReader.getUsers();
    }

    public static void main(String[] args) {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        String line;
        do {
            login.menu();
            line = sc.nextLine();
            login.userSelection(sc, line);
        } while(!line.equals("3"));
    }

    private void userSelection(Scanner sc, String action) {
        switch(action) {
            case "1" -> registration(sc);
            case "2" -> login(sc);
            case "3" -> {
                loginWriterReader.saveUsers(users);
                System.out.println("Programa baige darba");
            }
            default -> System.out.println("Tokio veiksmo nera!");
        }
    }

    private void login(Scanner sc) {
        System.out.println("Iveskite username");
        String username = sc.nextLine();
        User user = users.get(username);
        if(user == null) {
            System.out.println("Tokio userio nera, prasome priregistruoti");
            return;
        }

        System.out.println("Iveskite slaptazodi:");
        String password = sc.nextLine();
        if(!user.password().equals(DigestUtils.sha512Hex(password))) {
            System.out.println("Neteisingas slaptazodis");
            return;
        }

        System.out.printf("Sveiki prisijunge %s %s%n", user.name(), user.surname());
    }

    private void registration(Scanner scanner) {
        User user;
        String userName;
        do {
            System.out.println("Iveskite username:");
            userName = scanner.nextLine();
            user = users.get(userName);
            if(user != null) {
                System.out.println("Toks vartotojas yra");
            }
        } while(user != null);

        System.out.println("Iveskite varda:");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde:");
        String surname = scanner.nextLine();
        System.out.println("Iveskite slaptazodi");
        String password = scanner.nextLine();

        String repeatPassword;
        do {
            System.out.println("Pakartokite slaptazodi:");
            repeatPassword = scanner.nextLine();
        } while(!repeatPassword.equals(password));

        user = new User(userName, name , surname, DigestUtils.sha512Hex(password));
        users.put(userName, user);
    }

    private void menu() {
        System.out.println("""
								   [1]. Registration
								   [2]. Login
								   [3]. Exit
								   """);
    }
}