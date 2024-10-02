/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Rubio
 */
public class Gato extends Animal {
    //Atributos
    
    //Constructor
    public Gato() {
        super();
    }
    
    public Gato(String nombre) {
        super(nombre);
    }
    
    public Gato(String raza, String nombre) {
        super(raza, nombre);
    }
    
    @Override
    public void comer() {
        System.out.println("Se le dieron croquetas Kirkland Maintenance a " + 
                this.getNombre());
    }
    

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Gato)) {
            return false;
        }
        Gato p = (Gato) obj; //Casting
        
        return this.nombre.equals(p.nombre) 
                && this.dueno.equals(p.dueno);
    }
    
    
}
