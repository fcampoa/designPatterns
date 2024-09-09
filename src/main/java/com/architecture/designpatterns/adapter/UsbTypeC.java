/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.adapter;

/**
 *
 * @author felix
 */
public class UsbTypeC implements IConnectable {
    private boolean on;
    
    public UsbTypeC() {}
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public boolean getOn() {
        return on;
    }
    
    @Override
    public void on() {
        setOn(true);
        System.out.println("android device is on");
    }

    @Override
    public void off() {
        setOn(false);
        System.out.println("android device is off");
    }
    
}
