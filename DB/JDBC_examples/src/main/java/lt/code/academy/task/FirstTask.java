package lt.code.academy.task;

import lt.code.academy.ApplicationProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 Naudojant JAVA:
 4. Papildyti programą galimybe priskirti darbuotoją projektui
 */

public class FirstTask {
    private final Scanner scanner;
    private final Connection connection;

    public FirstTask(Connection connection) {
        this.connection = connection;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws SQLException {
        ApplicationProperties properties = ApplicationProperties.getInstance();
        Connection connection = DriverManager.getConnection(properties.getValue("jdbc.h2.connection.url"),
                properties.getValue("jdbc.h2.connection.name"),
                properties.getValue("jdbc.h2.connection.password"));
        if(connection == null) {
            System.out.println("Nepavyko prisijungti prie DB....");

            return;
        }

        FirstTask task = new FirstTask(connection);

        String action;
        do {
            task.menu();
            action = task.scanner.nextLine();
            task.userSelection(action);
        } while(!action.equals("5"));
    }

    private void userSelection(String action) throws SQLException {
        switch(action) {
            case "1" -> showAllEmployers();
            case "2" -> showAllEmployersByCompany();
            case "3" -> createNewEmployee();
            case "4" -> updateEmployeeProject();
            case "5" -> System.out.println("Program baige darba");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void showAllEmployers() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT vardas, pavarde FROM darbuotojas");

        while(resultSet.next()) {
            System.out.printf(" > %s %s %n", resultSet.getString("vardas"), resultSet.getString("pavarde"));
        }

        statement.close();
    }

    private void showAllEmployersByCompany() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("""
															 SELECT vardas, pavarde, pavadinimas FROM darbuotojas
															 JOIN projektas ON projektas_id = id
															 ORDER BY pavadinimas
															 """);

        String name = "";
        int count = 0;
        while(resultSet.next()) {
            String projectName = resultSet.getString("pavadinimas");

            if(!name.equals(projectName)) {
                System.out.printf("= %s =%n", projectName);
                name = projectName;
                count = 1;
            }

            System.out.printf("\t%s. %s %s%n", count++, resultSet.getString("vardas"), resultSet.getString("pavarde"));
        }

        statement.close();
    }

    private void createNewEmployee() throws SQLException {
        System.out.println("Iveskite asmens koda:");
        String employeeCode = scanner.nextLine();
        System.out.println("Iveskite varda:");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde:");
        String surname = scanner.nextLine();
        String workFrom = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Iveskite gimimo metus:");
        String birthDay = scanner.nextLine();
        System.out.println("Iveskite pareigas:");
        String responsibility = scanner.nextLine();
        System.out.println("Iveskite skyriu:");
        String department = scanner.nextLine();
        System.out.println("Iveskite projekto id:");
        int projectId = Integer.parseInt(scanner.nextLine());
        System.out.println("Iveskite alga:");
        int salary = Integer.parseInt(scanner.nextLine());

        PreparedStatement statement = connection.prepareStatement("INSERT INTO darbuotojas VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, employeeCode);
        statement.setString(2, name);
        statement.setString(3, surname);
        statement.setString(4, workFrom);
        statement.setString(5, birthDay);
        statement.setString(6, responsibility);
        statement.setString(7, department);
        statement.setInt(8, projectId);
        statement.setInt(9, salary);

        statement.execute();
        statement.close();
    }

    private void updateEmployeeProject() throws SQLException {
        System.out.println("Iveskite asmens koda:");
        String personCode = scanner.nextLine();
        System.out.println("Iveskite naujo projekto id");
        int projectId = Integer.parseInt(scanner.nextLine());

        PreparedStatement statement = connection.prepareStatement("UPDATE darbuotojas SET projektas_id = ? WHERE asmenskodas = ?");
        statement.setInt(1, projectId);
        statement.setString(2, personCode);

        statement.executeUpdate();
        statement.close();
    }

    private void menu() {
        System.out.println("""
								1. Išvesti visų darbuotojų vardus ir pavardes
								2. Išvesti visus projektus ir juose dirbančius žmones
								3. įvesti naujus darbuotojus
								4. priskirti darbuotoją projektui
								5. Exit
								   """);
    }
}