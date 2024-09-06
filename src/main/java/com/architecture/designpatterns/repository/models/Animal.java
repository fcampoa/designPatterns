/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository.models;

/**
 *
 * @author felix
 */
public class Animal extends BaseEntity {
    private String ecosystem;
    
    public Animal(long id, String ecosystem) {
        super(id);
        this.ecosystem = ecosystem;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }    
    
}
