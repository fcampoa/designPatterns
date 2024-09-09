/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.unitofwork;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.dao.impl.PersistenceUnit;
import com.architecture.designpatterns.repository.models.Animal;
import com.architecture.designpatterns.repository.models.Person;

/**
 *
 * @author felix
 */
public class UnitOfWorkTest {
    
    public static void main(String[] args) {
        DatabaseConnection dbContext = PersistenceUnit.getConnection("localhost", "admin", "admin", "test", 3307, "mysql");
        UnitOfWork uow = new UnitOfWork(dbContext);
        
        uow.personRepo().create(new Person());
        uow.animalRepo().create(new Animal(1, "desert"));
        
        uow.commit();
    }
    
}
