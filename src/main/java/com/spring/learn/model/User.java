package com.spring.learn.model;

import java.io.Serializable;

/**
 * Created by baiguantao on 2017/5/22.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8451987885010054674L;
    private String userId;

    private String userName;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
