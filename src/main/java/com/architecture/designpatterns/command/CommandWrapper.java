/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.command;

import com.architecture.designpatterns.repository.models.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class CommandWrapper implements ICommand {
    
    private List<ICommand> commands = new ArrayList<>();
    
    public CommandWrapper() {}

    @Override
    public void execute(Person person) {
        commands.forEach(c -> c.execute(person));
    } 
    
    public void addCommand(ICommand command) {
        commands.add(command);
    }
    
}
