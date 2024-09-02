/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.proxy;

/**
 *
 * @author felix
 */
public class MessageServiceImpl implements IMessageService {

    @Override
    public String sendMessage(String message) {
        return "Sending message: " + message;
    }
    
}
