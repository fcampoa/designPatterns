/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator;

/**
 *
 * @author felix
 */
public class DecoratorTest {
    
    public static void main(String[] args) {
        // Para este ejemplo, vamos a simular un sistema que envía notificaciones por distintos medios.
        
        // Primero creamos un notificador
        Notification notifier = new Notification();
        // Vamos agregando los decoradores, por ejemplo, vamos a enviar una notifiacion por SMS y le pasamos nuestro notificador como paramentro
        SMSNotification smsNotification = new SMSNotification(notifier);
        // Agreguemos ahora una notificacion por correo  y le pasamos el notificador de SMS como parametro.
        EmailNotification emailNotification = new EmailNotification(smsNotification);
        // Por ultimo, vamos a enviar una notificacion a facebook, y le pasamos el notificador de correo como parametro
        FacebookNotification facebookNotification = new FacebookNotification(emailNotification);
        // Solo nos resta invocar el método que enviará todas las notificaciones.
        facebookNotification.sendNotification();
    }
}
