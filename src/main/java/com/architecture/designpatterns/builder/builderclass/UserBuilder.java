/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.builderclass;

/**
 *
 * @author felix
 */
public class UserBuilder {
    private long id;
    private String username;
    private String password;
    
    public UserBuilder id(long id) {
        this.id = id;
        return this;
    }
    
    public UserBuilder userName(String username) {
        this.username = username;
        return this;
    }
    
    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }
    
    public User build() {
        return new User(this);
    }
    
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }    
}
