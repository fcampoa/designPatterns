/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.chainofresponsability;

/**
 *
 * @author felix
 */
public class ExecutiveTeamLead extends IApprover {

    @Override
    public void loanRequest(int amount) {
                if (amount > 10000 && amount <= 50000) {
        System.out.println("i can handle this. Executive leader");
        return;
    }
        next.loanRequest(amount);
    }
    
}
