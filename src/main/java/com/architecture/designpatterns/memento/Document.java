/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.memento;

/**
 *
 * @author felix
 */
public class Document {

    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void write(String text) {
        this.content += text;
    }

    public String getContent() {
        return this.content;
    }

    public DocumentState createState() {
        return new DocumentState(this.content);
    }

    public void restoreFromState(DocumentState state) {
        this.content = state.getSavedContent();
    }
}
