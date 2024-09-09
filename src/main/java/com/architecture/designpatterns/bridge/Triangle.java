/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.bridge;

/**
 *
 * @author felix
 */
public class Triangle extends Shape {
    
    public Triangle(IColor color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing a triangle");
        color.fillColor();
    }
    
}
