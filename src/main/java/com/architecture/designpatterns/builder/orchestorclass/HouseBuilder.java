/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.orchestorclass;

/**
 *
 * @author felix
 */
public interface HouseBuilder {
    
    public void buildFoundations();
    public void buildStructure();
    public void buildCeiling();
    public void buildInside();
    public House getHouse();
}
