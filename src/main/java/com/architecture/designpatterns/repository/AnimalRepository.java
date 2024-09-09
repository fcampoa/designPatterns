/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.repository.models.Animal;

/**
 *
 * @author felix
 */
public class AnimalRepository extends Repository<Animal>{
    
    public AnimalRepository(DatabaseConnection connection) {
        super(connection);
    }
    
}
