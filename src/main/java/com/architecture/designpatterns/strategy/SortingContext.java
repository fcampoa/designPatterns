/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.strategy;

/**
 *
 * @author felix
 */
public class SortingContext {
    
    private SortingStrategy sortingStrategy;
    
    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    
    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}
