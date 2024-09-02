/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.proxy;

/**
 *
 * @author felix
 */
public class ProxyTest {
    
    public static void main(String[] args) {
        // Supongamos que queremos enviar un mensage, y tenemo un servicio que lo hace
        IMessageService messageService = new MessageServiceImpl();
        // simplemente invocamos el método de sendMessage y listo
        System.out.println(messageService.sendMessage("my first message"));
        /* ahora supongamos que necesitamos hacer un log indicando que se envió un mensaje.
           podríamos agregar esa funcionalidad a la clase que envía el mensaje,
           pero estariamos violando el prinicipio de responsabilidad única.
           La solución es crear un objeto proxy, qne envía el mensaje y aparte haga el log.        
        */
        IMessageService messageServiceProxy = new MessageServiceProxy();
        System.out.println(messageServiceProxy.sendMessage("mensaje a traves del proxy"));
        
    }
    
}
