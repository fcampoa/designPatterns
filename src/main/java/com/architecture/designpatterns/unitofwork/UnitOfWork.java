/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.unitofwork;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.repository.AnimalRepository;
import com.architecture.designpatterns.repository.IRepository;
import com.architecture.designpatterns.repository.PersonRepository;
import com.architecture.designpatterns.repository.models.Animal;
import com.architecture.designpatterns.repository.models.Person;

/**
 *
 * @author felix
 */
public class UnitOfWork implements IUnitOfWork {
    
    private DatabaseConnection dbContext;
    private IRepository<Person> _personRepo;
    private IRepository<Animal> _animalRepo;
    
    public UnitOfWork(DatabaseConnection dbContext) {
        this.dbContext = dbContext;
    }
    
    public IRepository<Person> personRepo() {
        return _personRepo != null ? _personRepo : (_personRepo = new PersonRepository(dbContext));
    }
    
    public IRepository<Animal> animalRepo() {
        return _animalRepo != null ? _animalRepo : (_animalRepo = new AnimalRepository(dbContext));
    }

    @Override
    public void commit() {
       dbContext.commit();
        System.out.println("changes saved");
    }

    @Override
    public void commitAsyc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
