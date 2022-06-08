package com.atsushi.kitazawa.model;

public class User {

    private String userId;
    private String userName;
    private String birthDay;
    private String email;

    public User(String userId, String userName, String birthDay, String email) {
        this.userId = userId;
        this.userName = userName;
        this.birthDay = birthDay;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [birthDay=" + birthDay + ", email=" + email + ", userId=" + userId + ", userName=" + userName
                + "]";
    }

}
