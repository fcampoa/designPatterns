/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator.abstractfactory;

/**
 *
 * @author felix
 */
public class FactoryConfiguration {
    public static ISmarthphoneFactory getFactory(String provider) {
        switch(provider) {
            case "Samsung" -> {
                return new SamsungFactory();
            }
            case "Iphone" -> {
                return new IphoneFactory();
            }
            case "Xiaomi" -> {
                return new XiaomiFactory();
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}
