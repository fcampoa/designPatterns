/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.architecture.designpatterns.dao;

import java.util.List;

/**
 *
 * @author felix
 */
public abstract class DatabaseConnection {
    protected String connectionString;
    protected String host;
    protected String user;
    protected String password;
    protected String databaseName;
    protected int port;
    protected static DatabaseConnection instance;
    protected List tables;
    
    public abstract void open() throws Exception;
    public abstract void close() throws Exception;
    public abstract Object createQuery(String query) throws Exception;
    public abstract Object createUpdate(String query) throws Exception;
    public abstract int commit();
    
    public DatabaseConnection connectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    
    public DatabaseConnection host(String host) {
        this.host = host;
        return this;
    }
    
    public DatabaseConnection user(String user) {
        this.user = user;
        return this;
    }
    
    public DatabaseConnection password(String password) {
        this.password = password;
        return this;
    }
    
    public DatabaseConnection databaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    
    public DatabaseConnection port(int port) {
        this.port = port;
        return this;
    }
}
