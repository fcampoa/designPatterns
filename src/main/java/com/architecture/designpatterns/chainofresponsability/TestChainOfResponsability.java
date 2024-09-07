/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.chainofresponsability;

/**
 *
 * @author felix
 */
public class TestChainOfResponsability {
    
    public static void main(String[] args) {
        var bank = new Bank();
        bank.loanRequest(560000);
    }
    
}
