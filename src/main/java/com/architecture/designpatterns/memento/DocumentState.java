/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.memento;

/**
 *
 * @author felix
 */
public class DocumentState {

    private String content;

    public DocumentState(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }
}
