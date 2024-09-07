/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.templatemethod;

/**
 *
 * @author felix
 */
public enum HttpMethod {
    GET("GET", 0),
    POST("POST", 1),
    PUT("PUT", 2),
    PATCH("PATCH", 3),
    DELETE("DELETE", 4),
    OPTIONS("OPTIONS", 5);
    
    private String name;
    private int value;
    
    private HttpMethod(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public int getValue() {
        return value;
    }
}
