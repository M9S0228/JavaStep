package org.example;

import java.sql.*;

public class ReadDeleteDB {
    public static final String selectQuery = """
                select * from notice
            """;
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5436/jdbc.db",
                "sa",
                "admin");
        ){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String message = resultSet.getString(2);
                String type = resultSet.getString(3);
                boolean processed = resultSet.getBoolean(4);


                System.out.println(id + " | " + message + " | " + type + " | " + processed);

                //Видалення по id з бази даних
                Statement deleteStmt = connection.createStatement();
                String deleteQuery = "DELETE FROM notice WHERE Id = " + id;
                deleteStmt.executeUpdate(deleteQuery);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
