/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.chainofresponsability;

/**
 *
 * @author felix
 */
public class Bank extends IApprover {

    @Override
    public void loanRequest(int amount) {
        var accountExecutive = new AccountExecutive();
        this.setNext(accountExecutive);
        
        var executiveTeamLead = new ExecutiveTeamLead();
        accountExecutive.setNext(executiveTeamLead);
        
        var manager = new Manager();
        executiveTeamLead.setNext(manager);
        
        var director = new Director();
        manager.setNext(director);
        
        next.loanRequest(amount);
    }
    
}
