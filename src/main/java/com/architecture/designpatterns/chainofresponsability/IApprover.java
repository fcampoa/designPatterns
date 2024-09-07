/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.architecture.designpatterns.chainofresponsability;

/**
 *
 * @author felix
 */
public abstract class IApprover {
    protected IApprover next;
    
    public void setNext(IApprover next) {
        this.next = next;
    }
    public IApprover getNext() {
        return next;
    }
    public abstract void loanRequest(int amount);
}
