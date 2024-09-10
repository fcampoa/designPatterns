/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.strategy;

/**
 *
 * @author felix
 */
public class QuickSortStrategy implements SortingStrategy {

    @Override
    public void sort(int... arr) {
        System.out.println("Sorting using Quick method");
    }
    
}
