/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.memento;

/**
 *
 * @author felix
 */
public class MementoTest {

    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        // Write some content
        document.write("Additional content\n");
        history.addState(document.createState());

        // Write more content
        document.write("More content\n");
        history.addState(document.createState());

        // Restore to previous state
        document.restoreFromState(history.getState(0));

        // Print document content
        System.out.println(document.getContent());
    }

}
