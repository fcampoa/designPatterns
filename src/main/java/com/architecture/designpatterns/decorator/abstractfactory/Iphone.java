/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.decorator.abstractfactory;

/**
 *
 * @author felix
 */
public class Iphone implements ISmartphone {

    @Override
    public String getOS() {
        return "IOS";
    }

    @Override
    public String getModel() {
        return "15 Pro";
    }

    @Override
    public int getYear() {
        return 2023;
    }

    @Override
    public int getMemorySize() {
        return 256;
    }
    @Override
    public String toString() {
        return getOS() + ", " + getModel() + ", " + getYear() + ", " + getMemorySize();
    }
}
