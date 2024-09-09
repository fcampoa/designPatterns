/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.observer;

import javax.swing.JTextField;

/**
 *
 * @author felix
 */
public class ConcrateObserver implements IObserver {
    private Object value;
    private JTextField input;
    
    public ConcrateObserver() {}
    
    public ConcrateObserver(JTextField input) {
        this.input = input;
    }
    
    @Override
    public void updateValue(Object value) {
        this.value = value;
        this.input.setText(this.value.toString());
    }
    
}
