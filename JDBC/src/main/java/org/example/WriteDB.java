package org.example;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Random;


public class WriteDB
{

    public static void main( String[] args )
    {
        String[] messages = {"Нове повідомлення від ", "Сталася помилка в "};
        String[] types = {"INFO", "ERROR", "WARNING"};

        System.out.println( "Hello World!" );

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5436/jdbc.db",
                "sa",
                "admin");
        ){
            while (true){
                String name = messages[new Random().nextInt(messages.length)] + LocalDateTime.now();
                String type = types[new Random().nextInt(types.length)];
                boolean processed = false;

                String insertQuery = "INSERT INTO notice (message, type, processed) VALUES (?, ?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, type);
                preparedStatement.setBoolean(3, processed);
                preparedStatement.executeUpdate();

                Thread.sleep(1000);
            }

        } catch (SQLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
