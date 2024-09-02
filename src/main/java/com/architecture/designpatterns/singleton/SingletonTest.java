/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.designpatterns.singleton;

/**
 *
 * @author felix
 */
public class SingletonTest {
    
    public static void main(String[] args) {
        // Obtenemos la instancia y la guardamos en una variable, la cual hará referencia al objeto en memoria.
        Singleton instance1 = Singleton.getInstance();
        // Creamos otra referencia a la instancia, con la cual validaremos que estamos referenciando al mismo objeto.
        Singleton instance2 = Singleton.getInstance();
        // Imprimimos la primera instancia. NOTA: al no tener sobreescrito el toString, nos imprimirá la dirección en memoria
        //del objeto
        System.out.println("Dirección de instancia1: " + instance1);
        // Imprimimos instance2 para validar que es la misma referencia.
        System.out.println("Dirección de instancia2: " + instance2);
    }
    
}
