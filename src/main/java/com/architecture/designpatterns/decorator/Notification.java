/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator;

/**
 *
 * @author felix
 */
public class Notification implements INotification{

    @Override
    public void sendNotification() {
        System.out.println("Sending notifications...");
    }
    
}
