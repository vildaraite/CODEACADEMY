package lt.code.academy.h2;

import java.sql.*;

public class HdConnectionExample {
    private static final String URL = "jdbc:h2:~/paskaita";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws SQLException {
        // 1. Sukurti connectiona
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        if (connection == null) {
            System.out.println("Nepavyko prisijungti prie H2");
            return;
        }

        System.out.println("Prisijungeme prie H2");

        // 2. sukurti statmenta
        Statement statement = connection.createStatement();

        // 3. executintit statmenta
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DARBUOTOJAS");
        //statement.execute() //delete
        //statement.executeUpdate() // update

        HdConnectionExample example = new HdConnectionExample();
        example.printEmployers(resultSet);

        //Database info
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tablesResultSet = metaData.getTables(null, "PUBLIC", null, null);

        System.out.println("Visos lenteles Duomenu bazeje:");
        while(tablesResultSet.next()) {
            System.out.println(tablesResultSet.getString(3));
        }

        // select with filters
        System.out.println("\nIsfiltruoti");
        int id = 1;
        int sum = 3200;
        //resultSet = statement.executeQuery("SELECT * FROM DARBUOTOJAS WHERE PROJEKTAS_ID = " + id + " AND ALGA >= " + sum);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM DARBUOTOJAS WHERE PROJEKTAS_ID = ? AND ALGA >= ?");
        preparedStatement.setInt(1, id);
        preparedStatement.setInt(2, sum);
        resultSet = preparedStatement.executeQuery();

        example.printEmployers(resultSet);

        // update colum on result set

        Statement updateStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = updateStatement.executeQuery("SELECT * FROM DARBUOTOJAS WHERE asmenskodas = 38109197598");

        while(resultSet.next()) {
            resultSet.updateString("vardas", resultSet.getString("vardas").toUpperCase());
            resultSet.updateString("pavarde", resultSet.getString("pavarde").toUpperCase());
            resultSet.updateRow();
        }

        //INSERT
        preparedStatement = connection.prepareStatement("INSERT INTO PROJEKTAS (ID, PAVADINIMAS) VALUES (?, ?)");
        preparedStatement.setInt(1, 4);
        preparedStatement.setString(2, "Testine");
        preparedStatement.execute();

        // UPDATE
        preparedStatement = connection.prepareStatement("UPDATE PROJEKTAS SET pavadinimas = ? WHERE id = ?");
        preparedStatement.setInt(2, 4);
        preparedStatement.setString(1, "Nauja reiksme testine");
        preparedStatement.executeUpdate();

        //DELETE
        //statement = connection.createStatement();
        statement.execute("""
DELETE DARBUOTOJAS WHERE ASMENSKODAS = 38901228523;
DELETE PROJEKTAS WHERE ID = 4;
""");
    }

    private void printEmployers(ResultSet resultSet) throws SQLException {
        while(resultSet.next()) {
            // pagal stulpelio pavadinimas
            //System.out.println(resultSet.getLong("asmenskodas") + " " + resultSet.getString("vardas") + " " + resultSet.getString("pavarde"));
            // pagal stulpelio indeksa
            System.out.println(resultSet.getLong(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }
}