package com.atsushi.kitazawa.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.atsushi.kitazawa.model.User;

public class UserRepository {

    public User findById(String id) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = getConn();
            PreparedStatement ps = conn.prepareStatement("select * from users where user_id = '1'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("user_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new User("1", "user1", "2000/01/01", "user1@example.com");
    }

    private Connection getConn() throws SQLException {
        String url = "jdbc:postgresql://my_postgres_13:5432/spring_mvc_example";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");
        // props.setProperty("ssl", "true");
        Connection conn = DriverManager.getConnection(url, props);
        return conn;
    }
}
