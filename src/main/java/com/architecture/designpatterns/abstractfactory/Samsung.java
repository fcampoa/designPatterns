/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.abstractfactory;

/**
 *
 * @author felix
 */
public class Samsung implements ISmartphone {

    @Override
    public String getOS() {
        return "Android 14";
    }

    @Override
    public String getModel() {
        return "S24";
    }

    @Override
    public int getYear() {
        return 2024;
    }

    @Override
    public int getMemorySize() {
        return 512;
    }
    
    @Override
    public String toString() {
        return getOS() + ", " + getModel() + ", " + getYear() + ", " + getMemorySize();
    }    
}
