/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Carlos Rubio
 */
public class Perro extends Animal{
    //Atributos
    
    //Constructor
    public Perro() {
        super();
    }
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    public Perro(String raza, String nombre) {
        super(raza, nombre);
    }
    
    @Override
    public void comer() {
        System.out.println("Se le dieron croquetas Dog Chow a " + 
                this.getNombre());
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Perro)) {
            return false;
        }
        Perro p = (Perro) obj; //Casting
        
        return this.nombre.equals(p.nombre) 
                && this.dueno.equals(p.dueno);
    }   
}