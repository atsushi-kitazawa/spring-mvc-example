package com.atsushi.kitazawa.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.atsushi.kitazawa.model.User;

public class UserRepository {

    public User findById(String id) {
        User user = null;
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement("select * from users where user_id = ?");) {
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

    public void save(User u) {
        try (Connection conn = DatabaseConnection.getConnection();) {
            conn.setAutoCommit(false);
            try (PreparedStatement ps = conn.prepareStatement("insert into users values (?, ?, ?, ?)");) {
                ps.setString(1, u.getUserId());
                ps.setString(2, u.getUserName());
                ps.setString(3, u.getBirthday());
                ps.setString(4, u.getEmail());
                ps.executeUpdate();
                conn.commit();
            } catch (Exception e) {
                e.printStackTrace();
                conn.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
