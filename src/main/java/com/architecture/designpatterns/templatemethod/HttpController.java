/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.templatemethod;

import com.architecture.designpatterns.repository.IRepository;
import com.architecture.designpatterns.templatemethod.requests.Request;

/**
 *
 * @author felix
 */
public abstract class HttpController {
    protected IRepository repo;
    
    public final void handle(Request request) {
        switch(request.httpMethod()) {
            case HttpMethod.GET -> { get(request);}
            case HttpMethod.POST -> {post(request); }
            case HttpMethod.PUT -> {put(request); }
            case HttpMethod.PATCH -> {patch(request); }
            case HttpMethod.DELETE -> {delete(request); }
            case HttpMethod.OPTIONS -> {options(request); }
        }
    }
    
    protected abstract void get(Request request);
    protected abstract void post(Request request);
    protected abstract void put(Request request);
    protected abstract void patch(Request request);
    protected abstract void delete(Request request);
    protected abstract void options(Request request);
}
