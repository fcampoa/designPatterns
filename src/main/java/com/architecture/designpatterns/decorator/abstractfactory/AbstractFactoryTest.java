/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator.abstractfactory;

/**
 *
 * @author felix
 */
public class AbstractFactoryTest {
    
    public static void main(String[] args) {
        // Obtenemos el tipo de fábrica que necesitamos, indicando el proveedor (Samsung, Iphone, Xiaomi).
        ISmarthphoneFactory samsungFactory = FactoryConfiguration.getFactory("Samsung");
        // Obtenemos un smartphone de la fábrica.
        ISmartphone samsung = samsungFactory.createSmartphone();
        // Imprimimos el resultado
        System.out.println(samsung);
        
        // podemos hacer lo mismo para cada tipo de fábrica
        ISmarthphoneFactory iphoneFactory = FactoryConfiguration.getFactory("Iphone");
        ISmartphone iphone = iphoneFactory.createSmartphone();
        System.out.println(iphone);
        
        ISmarthphoneFactory xiaomiFactory = FactoryConfiguration.getFactory("Xiaomi");
        ISmartphone xiaomi = xiaomiFactory.createSmartphone();
        System.out.println(xiaomi);
    }
    
}
