/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.repository.models.Person;

/**
 *
 * @author felix
 */
public class PersonRepository extends Repository<Person>{
    
    public PersonRepository(DatabaseConnection connection) {
        super(connection);
    }
    
}
