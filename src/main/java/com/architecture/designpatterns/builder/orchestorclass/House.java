/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.orchestorclass;

/**
 *
 * @author felix
 */
public class House {
    private String foundations;
    private String structure;
    private String ceiling;
    private String inside;
    
    public House() {}

    public House(String foundations, String structure, String ceiling, String inside) {
        this.foundations = foundations;
        this.structure = structure;
        this.ceiling = ceiling;
        this.inside = inside;
    }

    public String getFoundations() {
        return foundations;
    }

    public void setFoundations(String foundations) {
        this.foundations = foundations;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    @Override
    public String toString() {
        return "House{" + "foundations=" + foundations + ", structure=" + structure + ", ceiling=" + ceiling + ", inside=" + inside + '}';
    }    
}
