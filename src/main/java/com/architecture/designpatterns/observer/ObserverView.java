/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.observer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author felix
 */
public class ObserverView extends JFrame {
    private JTextField valueInput;
    private JTextField subscriberText1;
    private JTextField subscriberText2;
    private JTextField subscriberText3;
    private JButton subscriberButton1;
    private JButton subscriberButton2;
    private JButton subscriberButton3;
    private JButton unSubscribeButton1;
    private JButton unSubscribeButton2;
    private JButton unSubscribeButton3;
    private JButton updateValueButton;
    
    private IObserver observer1;
    private IObserver observer2;
    private IObserver observer3;
    
    private ConcrateObservable observable;
    
    public ObserverView() {
        initComponents();
        layoutSetup();
        viewSetup();
        initObservers();
        addButtonActions();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void initObservers() {
        observable = new ConcrateObservable();
        observer1 = new ConcrateObserver(subscriberText1);
        observer2 = new ConcrateObserver(subscriberText2);
        observer3 = new ConcrateObserver(subscriberText3);
    }
    private void initComponents() {
        valueInput = new JTextField();
        updateValueButton = new JButton("Update value");
        
        subscriberText1 = new JTextField();
        subscriberText1.setEnabled(false);
        subscriberButton1 = new JButton("Subscribe");
        unSubscribeButton1 = new JButton("Unsuscribe");
        
        subscriberText2 = new JTextField();
        subscriberText2.setEnabled(false);
        subscriberButton2 = new JButton("Subscribe");
        unSubscribeButton2 = new JButton("Unsubscribe");
        
        subscriberText3 = new JTextField();
        subscriberText3.setEnabled(false);
        subscriberButton3 = new JButton("Subscribe");
        unSubscribeButton3 = new JButton("Unsubscribe");
    }
    
    private void layoutSetup(){
        GridLayout gridLayout = new GridLayout(4,3);
        gridLayout.setHgap(25);
        gridLayout.setVgap(15);
        setLayout(gridLayout);
    }
    
    private void viewSetup(){
        setSize(400,200);
        
        add(valueInput);
        add(updateValueButton);
        add(new JPanel());
        
        add(subscriberText1);
        add(subscriberButton1);
        add(unSubscribeButton1);
        
        add(subscriberText2);
        add(subscriberButton2);
        add(unSubscribeButton2);
        
        add(subscriberText3);
        add(subscriberButton3);
        add(unSubscribeButton3);
        
        setLocationRelativeTo(null);
    }
    
    private void addButtonActions() {
        updateValueButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                updateValue();
            }
        });
        
        subscriberButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.subscribe(observer1);
            }
        });
        
        subscriberButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.subscribe(observer2);
            }
        });
        
        subscriberButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.subscribe(observer3);
            }
        });
        
        unSubscribeButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.unSubscribe(observer1);
            }
        });
        
        unSubscribeButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.unSubscribe(observer2);
            }
        });
        
        unSubscribeButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                observable.unSubscribe(observer3);
            }
        });
    }
    
    private void updateValue() {
        observable.updateValue(valueInput.getText());
    }
}
