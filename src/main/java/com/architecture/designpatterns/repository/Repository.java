/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.repository.models.BaseEntity;
import java.util.List;

/**
 *
 * @author felix
 * @param <T>
 */
public class Repository<T extends BaseEntity> implements IRepository {
    
    private DatabaseConnection connection;
    
    public Repository(DatabaseConnection connection) {
        this.connection = connection;
    }

    @Override
    public BaseEntity create(BaseEntity entity) {
        try {
        entity.setCode((String) connection.createQuery("inser into"));            
        } catch(Exception ex) {
            
        }
        return entity;
    }

    @Override
    public BaseEntity read(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BaseEntity update(BaseEntity entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
