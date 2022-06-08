package com.atsushi.kitazawa.model;

public class User {

    private String userId;
    private String userName;
    private String birthday;
    private String email;

    public User() {
    }

    public User(String userId, String userName, String birthday, String email) {
        this.userId = userId;
        this.userName = userName;
        this.birthday = birthday;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [birthday=" + birthday + ", email=" + email + ", userId=" + userId + ", userName=" + userName
                + "]";
    }

}
