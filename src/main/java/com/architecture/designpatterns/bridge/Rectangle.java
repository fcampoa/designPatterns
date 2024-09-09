/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.bridge;

/**
 *
 * @author felix
 */
public class Rectangle extends Shape {
    
    public Rectangle(IColor color) {
       super(color);
   }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
        color.fillColor();
    }
    
}
