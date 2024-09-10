/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder.internalclassapproach;

/**
 *
 * @author felix
 */
public record Car(long id, String model, String agency, String type) {
    public static class Builder {
        private long id;
        private String model;
        private String agency;
        private String type;
        
        public Builder id(long id) {
            this.id = id;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder agency(String agency) {
            this.agency = agency;
            return this;
        }
        
        public Builder type(String type) {
            this.type = type;
            return this;
        }
        
        public Car build() {
            return new Car(id, model, agency, type);
        }
    }
}
