/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.orchestorclass;

/**
 *
 * @author felix
 */
public class IglooBuilder implements HouseBuilder {
    private House house;
    
    public IglooBuilder() {
        house = new House();
    }

    @Override
    public void buildFoundations() {
       house.setFoundations("ice rod");
    }

    @Override
    public void buildStructure() {
        house.setStructure("ice blocks");
    }

    @Override
    public void buildCeiling() {
        house.setCeiling("ice dome");
    }

    @Override
    public void buildInside() {
        house.setInside("ice decorations");
    }
    
    @Override
    public House getHouse() {
        return house;
    }
}
