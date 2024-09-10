/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.orchestorclass;

/**
 *
 * @author felix
 */
public class Engineer {
    
    private HouseBuilder houseBuilder;

    public Engineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    
    public void buildHouse() {
        houseBuilder.buildFoundations();
        houseBuilder.buildStructure();
        houseBuilder.buildCeiling();
        houseBuilder.buildInside();
    }
    
    public House getHouse() {
        return houseBuilder.getHouse();
    }
    
    public void setBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}
