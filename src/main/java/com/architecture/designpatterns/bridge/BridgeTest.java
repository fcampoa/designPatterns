/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.bridge;

/**
 *
 * @author felix
 */
public class BridgeTest {
    
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Black());
        
        Shape rectangle = new Rectangle(new Red());
        
        triangle.draw();
        rectangle.draw();
    }
    
}
