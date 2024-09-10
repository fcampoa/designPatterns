/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.orchestorclass;

/**
 *
 * @author felix
 */
public class WoodHouseBuilder implements HouseBuilder {
    private House house;
    
    public WoodHouseBuilder() {
        this. house = new House();
    }

    @Override
    public void buildFoundations() {
        house.setFoundations("wooden beams");
    }

    @Override
    public void buildStructure() {
        house.setStructure("wooden planks");
    }

    @Override
    public void buildCeiling() {
        house.setCeiling("wooden planks");
    }

    @Override
    public void buildInside() {
        house.setInside("wooden decorations");
    }
    
    @Override
    public House getHouse() {
        return house;
    }
}
