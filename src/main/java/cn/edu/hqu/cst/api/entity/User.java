package cn.edu.hqu.cst.api.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userSex;

    public User() {
    }

    public User(String userName, Integer userAge, String userSex) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
