/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.proxy;

/**
 *
 * @author felix
 */
public class MessageServiceProxy implements IMessageService {
private final IMessageService messageService;
private final ILogService logger;

public MessageServiceProxy() {
    this.messageService = new MessageServiceImpl();
    this.logger = new LogServiceImpl();
}
    @Override
    public String sendMessage(String message) {
        logger.log(message);
        return messageService.sendMessage(message);
    }
    
}
