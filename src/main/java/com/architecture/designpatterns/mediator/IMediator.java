/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.mediator;

/**
 *
 * @author felix
 */
public interface IMediator {

    void addUser(User user);

    void sendMessage(String message, User sender);
}
