package com.atsushi.kitazawa.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.atsushi.kitazawa.model.User;

public class UserRepository {

    public User findById(String id) {
        User user = null;
        try (Connection conn = DatabaseConnection.getConnection();) {
            PreparedStatement ps = conn.prepareStatement("select * from users where user_id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String userId = rs.getString("user_id");
                String userName = rs.getString("user_name");
                String birthDay = rs.getString("birthday");
                String email = rs.getString("email");
                user = new User(userId, userName, birthDay, email);
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
