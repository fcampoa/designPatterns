/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.dao.impl;

import com.architecture.designpatterns.dao.DatabaseConnection;

/**
 *
 * @author felix
 */
class PostgresqlConnection extends DatabaseConnection {
    
    private PostgresqlConnection() {}

    @Override
    public void open() throws Exception {
       System.out.println("Starting connection from postgresql...");
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object createQuery(String query) throws Exception {
        return "selected rows";
    }

    @Override
    public Object createUpdate(String query) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static DatabaseConnection getInstance() {
       return (instance != null) ? instance : (instance = new PostgresqlConnection());
    }

    @Override
    public int commit() {
        return 1;
    }
    
}
