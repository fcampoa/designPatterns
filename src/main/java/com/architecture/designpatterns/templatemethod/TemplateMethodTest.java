/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.templatemethod;

import com.architecture.designpatterns.templatemethod.requests.Request;

/**
 *
 * @author felix
 */
public class TemplateMethodTest {
    
    public static void main(String[] args) {
        var personController = new PersonController();
        
        var request = new Request(HttpMethod.GET, "tis is a message for get method");
        
        personController.handle(request);
    }
    
}
