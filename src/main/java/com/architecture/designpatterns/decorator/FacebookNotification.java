/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator;

/**
 *
 * @author felix
 */
public class FacebookNotification extends BaseDecorator {
    
    public FacebookNotification(INotification notification) {
        this.notification = notification;
    }
    @Override
    public void sendNotification() {
        this.notification.sendNotification();
        System.out.println("sending notification to facebook...");
    }
}
