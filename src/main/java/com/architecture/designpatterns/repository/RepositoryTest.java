/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.dao.impl.PersistenceUnit;
import com.architecture.designpatterns.repository.models.Person;

/**
 *
 * @author felix
 */
public class RepositoryTest {
    
    public static void main(String[] args) {
        DatabaseConnection connection = PersistenceUnit.getConnection("localhost", "admin", "admin", "architecture", -3306, "sqlserver");
        IRepository personRepository = new Repository<Person>(connection);
        Person p = new Person(1, "jhon doe");
        p.setCode("example");
        System.out.println(p.getCode());
        personRepository.create(p);
        System.out.println(p.getCode());
    }
    
}
