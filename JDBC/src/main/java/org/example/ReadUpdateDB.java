package org.example;

import java.sql.*;

public class ReadUpdateDB {

    public static final String selectQuery = """
                select * from notice
            """;
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5436/jdbc.db",
                "sa",
                "admin");
        ) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String message = resultSet.getString(2);
                String type = resultSet.getString(3);
                boolean processed = resultSet.getBoolean(4);

                System.out.println(id + " | " + message + " | " + type + " | " + processed);

                //Оновлення даних по id
                Statement updateStmt = connection.createStatement();
                String updateQuery = "UPDATE notice Set processed =" + true  + " WHERE Id = " + id;
                updateStmt.executeUpdate(updateQuery);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

