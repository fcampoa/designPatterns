/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.adapter;

/**
 *
 * @author felix
 */
public class IphoneConnectorCAdapter implements IConnectable {
    
    private IphoneConnector connector;
    
    public IphoneConnectorCAdapter(IphoneConnector connector) {
        this.connector = connector;
    }

    @Override
    public void on() {
        connector.setIsOn(true);
        System.out.println("iphone device is on");
    }

    @Override
    public void off() {
        connector.setIsOn(false);
        System.out.println("iphone device in off");
    }
    
}
