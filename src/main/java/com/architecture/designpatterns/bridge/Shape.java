/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.bridge;

/**
 *
 * @author felix
 */
public abstract class Shape {
    
    protected IColor color;
    
    public Shape(IColor color) {
        this.color = color;
    }
    
    public abstract void draw();
    
}
