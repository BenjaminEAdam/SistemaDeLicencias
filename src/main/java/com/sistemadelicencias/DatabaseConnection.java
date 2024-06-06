package com.sistemadelicencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Deberiamos pasarla por un .env???
    private static final String URL = "jdbc:mysql://localhost:3306/dblicencias";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Conexión exitosa a la base de datos.");
//        } catch (SQLException e) {
//            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
//        }
//        return connection;
        return  DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
