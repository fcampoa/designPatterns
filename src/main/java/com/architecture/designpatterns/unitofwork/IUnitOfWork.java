/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.architecture.designpatterns.unitofwork;

/**
 *
 * @author felix
 */
public interface IUnitOfWork {
    public void commit();
    public void commitAsyc();
}
