package org.project.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private final String URL = "jdbc:mysql://localhost:3306/labrob";
    private final String LOGIN = "Angrad";
    private final String PASSWORD = "23112003";

    private Connection connectionDB;

    public ConnectionDB(){
        try {
            connectionDB = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnectionDB() {
        return connectionDB;
    }
}
