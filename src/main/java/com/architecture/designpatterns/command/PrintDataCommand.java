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
public class PrintDataCommand implements ICommand {
    
    private StringBuilder sb = new StringBuilder();
    
    @Override
    public void execute(Person person) {
        sb.append("Personal information:")
                .append("\n")
                .append("name: ")
                .append(person.getName())
                .append("\n")
                .append("email: ")
                .append(person.getEmail())
                .append("\n")
                .append("phone number: ")
                .append(person.getPhone());
        
        System.out.println(sb.toString());
    }
    
}
