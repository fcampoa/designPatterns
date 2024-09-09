/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.adapter;

/**
 *
 * @author felix
 */
public class IphoneConnector {
    private boolean isOn;
    
    public IphoneConnector() {}
    
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public boolean getIsOn() {
        return isOn;
    }
}
