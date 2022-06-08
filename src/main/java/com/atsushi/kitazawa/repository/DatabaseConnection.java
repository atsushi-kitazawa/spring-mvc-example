package com.atsushi.kitazawa.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://my_postgres_13:5432/spring_mvc_example";
    private static final String USER = "postgres";
    private static final String PASS = "password";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", USER);
        props.setProperty("password", PASS);
        Connection conn = DriverManager.getConnection(URL, props);
        return conn;
    }
}
