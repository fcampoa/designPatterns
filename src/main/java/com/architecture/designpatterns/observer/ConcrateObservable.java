/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.observer;

/**
 *
 * @author felix
 */
public class ConcrateObservable extends Observable<String>{
    
    public ConcrateObservable() {}
    
    public ConcrateObservable(String value) {
        this.subject = value;
    }
    
}
