/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.dao.DatabaseConnection;
import com.architecture.designpatterns.repository.models.BaseEntity;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author felix
 * @param <T>
 */
public class Repository<T extends BaseEntity> implements IRepository {
    
    private DatabaseConnection connection;
    private Type type;
    
    public Repository(DatabaseConnection connection) {
        this.connection = connection;
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public BaseEntity create(BaseEntity entity) {
        try {
        entity.setCode((String) connection.createQuery("inser into")); 
        entity.setMsg(String.format("Creating entity of class {0} in class of {1}", type.getClass().getName(), getClass().getName()));
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
