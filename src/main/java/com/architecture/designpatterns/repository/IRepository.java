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
    
    public T create(T entity);
    public T read(long id);
    public T update(T entity);
    public void delete(long id);
    public List<T> getAll();
    
    
}
