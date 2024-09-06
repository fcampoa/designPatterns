/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository;

import com.architecture.designpatterns.repository.models.BaseEntity;
import java.util.List;

/**
 *
 * @author felix
 * @param <T>
 */
public interface IRepository <T extends BaseEntity>{
    
    T create(T entity);
    T read(long id);
    T update(T entity);
    void delete(long id);
    List<T> getAll();
    
    
}
