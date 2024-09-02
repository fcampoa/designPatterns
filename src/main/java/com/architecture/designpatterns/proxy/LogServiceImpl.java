/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.proxy;

/**
 *
 * @author felix
 */
public class LogServiceImpl implements ILogService {

    @Override
    public void log(String s) {
        System.out.println("se ha enviado un mensaje: " + s);
    }
    
}
