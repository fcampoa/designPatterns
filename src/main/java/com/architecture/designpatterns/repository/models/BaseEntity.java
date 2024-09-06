/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.repository.models;

/**
 *
 * @author felix
 */
public class BaseEntity {
    protected long id;
    protected String code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
   
    public BaseEntity() { }
    
    public BaseEntity(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
