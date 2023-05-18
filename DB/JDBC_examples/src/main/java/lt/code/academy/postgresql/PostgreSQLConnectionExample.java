package lt.code.academy.postgresql;

import lt.code.academy.ApplicationProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreSQLConnectionExample {
    private final Connection connection;

    public PostgreSQLConnectionExample (Connection connection) {
        this.connection = connection;
    }

    public static void main(String[] args) {
        ApplicationProperties properties = ApplicationProperties.getInstance();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(properties.getValue("jdbc.postgresql.connection.url"),
                    properties.getValue("jdbc.postgresql.connection.name"),
                    properties.getValue("jdbc.postgresql.connection.password"));
            if (connection != null) {
                System.out.println("Prisijungeme prie postgresql DB!");
            }
            PostgreSQLConnectionExample example = new PostgreSQLConnectionExample(connection);
            example.createUser("Vilda", "Beizaraite", "v.b@codeacademy.lt", "+37064000000");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private void createUser(String name, String surname, String email, String phone) throws SQLException {
      /*  PreparedStatement statement = connection.prepareStatement("INSERT INTO \"User\"(\"NAME\", \"SURNAME\", \"EMAIL\", \"PHONE\") VALUES (?, ?, ?, ?)");
        statement.setString(1, name);
        statement.setString(2, surname);
        statement.setString(3, email);
        statement.setString(4, phone);

        statement.executeUpdate();
        statement.close();*/

        new PrepareStatementWrapper(connection).create("INSERT INTO \"User\"(\"NAME\", \"SURNAME\", \"EMAIL\", \"PHONE\") VALUES (?, ?, ?, ?)")
                .setString(1, name)
                .setString(2, surname)
                .setString(3, email)
                .setString(4, phone)
                .execute();
    }
}
