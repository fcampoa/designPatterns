/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.builder;

import com.architecture.designpatterns.builder.builderclass.User;
import com.architecture.designpatterns.builder.builderclass.UserBuilder;
import com.architecture.designpatterns.builder.internalclassapproach.Car;
import com.architecture.designpatterns.builder.orchestorclass.Engineer;
import com.architecture.designpatterns.builder.orchestorclass.House;
import com.architecture.designpatterns.builder.orchestorclass.HouseBuilder;
import com.architecture.designpatterns.builder.orchestorclass.IglooBuilder;
import com.architecture.designpatterns.builder.orchestorclass.WoodHouseBuilder;

/**
 *
 * @author felix
 */
public class BuilderTest {
    
    public static void main(String[] args) {
        // builder con un record y una clase estatica interna
        var car =  new Car.Builder().id(1).model("camaro").agency("chevrolet").type("ATM").build();
        System.out.println(car);
        
        // builder con clase clase de construccion separada
        UserBuilder userBuilder = User.builder();
        var user = userBuilder.id(2).userName("tanjiro_kamado").password("nezuko").build();
        System.out.println(user);
        
        // builder con clase directora / orquestadora
        HouseBuilder builder = new IglooBuilder();
        Engineer engineer = new Engineer(builder);
        engineer.buildHouse();
        House igloo = engineer.getHouse();
        System.out.println(igloo);
        
        HouseBuilder builder2 = new WoodHouseBuilder();
        engineer.setBuilder(builder2);
        engineer.buildHouse();
        House woodenHouse = engineer.getHouse();
        System.out.println(woodenHouse);
    }
}
