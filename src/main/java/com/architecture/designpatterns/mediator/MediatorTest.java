/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.mediator;

/**
 *
 * @author felix
 */
public class MediatorTest {

    public static void main(String[] args) {
        IMediator chatRoom = new ChatRoomMediator();

        User felix = new ChatUser(chatRoom, "Felix");
        User ana = new ChatUser(chatRoom, "Ana");
        User luis = new ChatUser(chatRoom, "Luis");

        chatRoom.addUser(felix);
        chatRoom.addUser(ana);
        chatRoom.addUser(luis);

        felix.send("Hello everyone!");
        ana.send("Hi Felix!");
    }
}
