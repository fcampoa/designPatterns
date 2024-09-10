/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class History {
        private List<DocumentState> states;

    public History() {
        this.states = new ArrayList<>();
    }

    public void addState(DocumentState state) {
        this.states.add(state);
    }

    public DocumentState getState(int index) {
        return this.states.get(index);
    }
}
