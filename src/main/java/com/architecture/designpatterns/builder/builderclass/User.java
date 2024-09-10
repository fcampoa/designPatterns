/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.builderclass;

import static com.architecture.designpatterns.builder.builderclass.User.builder;

/**
 *
 * @author felix
 */
public class User {
    private long id;
    private String username;
    private String password;
    
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public User(UserBuilder userBuilder) {
        this.id = userBuilder.getId();
        this.username = userBuilder.getUsername();
        this.password = userBuilder.getPassword();
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }    
}
