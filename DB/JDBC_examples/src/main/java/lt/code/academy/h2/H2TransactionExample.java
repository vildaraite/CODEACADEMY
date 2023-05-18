package lt.code.academy.h2;

import lt.code.academy.ApplicationProperties;

import java.sql.*;

public class H2TransactionExample {
    public static void main(String[] args) {
        ApplicationProperties properties = ApplicationProperties.getInstance();
         Connection connection = null;
        try {
            connection = DriverManager.getConnection(properties.getInstance().getValue("jdbs.h2.connection.url"),
                    properties.getInstance().getValue("jdbs.h2.connection.name"),
                    properties.getInstance().getValue("jdbs.h2.connection.password"));


            connection.setAutoCommit(false); // atidarom transakcija, vykdysim tam tikras uzklausos, kol jos ivyks sekmingai

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE darbuotojas SET alga = ?");
            preparedStatement.setInt(1, 65000);
            preparedStatement.executeUpdate();

            throw new RuntimeException("Nepavyko atnaujinti");

            // because of runtimeExceptiono:   connection.commit(); // butinai REIKALINGAS COMMITS, KAD CHANGE'AI PASIMATYTU - visada rankiniu budu

        } catch (Exception e) {
            System.out.println(e.getMessage());
            if(connection != null){
                try {
                    connection.rollback();
                }
                catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if(connection != null) {
                try {
                    connection.setAutoCommit(true);
                }
                catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
