/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator;

/**
 *
 * @author felix
 */
public class EmailNotification extends BaseDecorator {

    public EmailNotification(INotification notificatio) {
        this.notification = notificatio;
    }
    
    @Override
    public void sendNotification() {
        this.notification.sendNotification();
        System.out.println("Sending email notification...");
    }
    
}
