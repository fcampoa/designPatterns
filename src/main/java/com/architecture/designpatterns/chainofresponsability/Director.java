/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.chainofresponsability;

/**
 *
 * @author felix
 */
public class Director extends IApprover {

    @Override
    public void loanRequest(int amount) {
                if (amount > 100000) {
        System.out.println("i can handle this. Director");
        return;
    }
        next.loanRequest(amount);
    }
    
}
