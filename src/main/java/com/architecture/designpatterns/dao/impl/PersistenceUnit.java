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
public class PersistenceUnit {
   private static DatabaseConnection connection;
   
   public static DatabaseConnection getConnection(String host, String user, String password, String databaseName, int port, String driver) {
       switch(driver) {
           case "sqlserver":
               connection = SqlServerConnection.getInstance();
               break;
           case "postgresql":
               connection = PostgresqlConnection.getInstance();
           case "mysql":
           default:
               connection = MySqlConnection.getInstance();
               break;
       }   
       return connection;
   }
}
