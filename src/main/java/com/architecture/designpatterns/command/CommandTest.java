/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.command;

import com.architecture.designpatterns.repository.models.Person;

/**
 *
 * @author felix
 */
public class CommandTest {
    
    public static void main(String[] args) {
        CommandWrapper wrapper = new CommandWrapper();
        
        wrapper.addCommand(new PrintDataCommand());
        wrapper.addCommand(new SendEmailCommand());
        wrapper.addCommand(new MakeCallCommand());
        
        CommandExecutor executor = new CommandExecutor();
        
        Person person = new Person();
        person.setName("jon snow");
        person.setEmail("jon.snow@winterfall.com");
        person.setPhone("1234567890");
        
        executor.ExecuteCommand(wrapper, person);
    }
    
}
