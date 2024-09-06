/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.dao;

import com.architecture.designpatterns.dao.impl.PersistenceUnit;

/**
 *
 * @author felix
 */
public class DaoTest {
    
    public static void main(String[] args) throws Exception {
        DatabaseConnection connection = PersistenceUnit.getConnection("localhost", "admin", "admin", "test", 3307, "postgresql");
        connection.open();
        var obj = connection.createQuery("select * from user");
        System.out.println(obj);
    }
}
