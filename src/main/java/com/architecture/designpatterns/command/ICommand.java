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
public interface ICommand {
    
    public void execute(Person person);
}
