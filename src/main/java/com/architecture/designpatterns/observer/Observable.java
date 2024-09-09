/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class Observable<T> {
    protected List<IObserver> subscribers = new ArrayList<>();
    protected T subject;
    
    protected void notifySubscribers() {
        subscribers.forEach(s -> s.updateValue(subject));
    }
    
    protected void subscribe(IObserver observer) {
        subscribers.add(observer);
        if(subject != null){
        notifyOne(observer);
        }
    }
    
    protected void unSubscribe(IObserver observer) {
        subscribers.remove(observer);
    }
    
    protected void notifyOne(IObserver observer) {
        if (subscribers.contains(observer)) {
        observer.updateValue(subject);
        }        
    }
    
    protected void updateValue(T value) {
        this.subject = value;
        notifySubscribers();
    }
}
