/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.adapter;

/**
 *
 * @author felix
 */
public class AdapterTest {
    
    public static void main(String[] args) {
        IConnectable androidDevice = new UsbTypeC();
        IConnectable iphoneAdatper = new IphoneConnectorCAdapter(new IphoneConnector());
        
        androidDevice.on();
        iphoneAdatper.on();
        androidDevice.off();
        iphoneAdatper.off();
    }
    
}
