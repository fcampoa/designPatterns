/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.abstractfactory;

/**
 *
 * @author felix
 */
public class SamsungFactory implements ISmarthphoneFactory {

    @Override
    public ISmartphone createSmartphone() {
        return new Samsung();
    }
    
}
