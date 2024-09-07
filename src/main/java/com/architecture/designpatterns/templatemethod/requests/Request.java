/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.templatemethod.requests;

import com.architecture.designpatterns.templatemethod.HttpMethod;

/**
 *
 * @author felix
 */
public record Request(HttpMethod httpMethod, String body) {
}
