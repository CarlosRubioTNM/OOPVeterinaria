/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;

/**
 *
 * @author Carlos Rubio
 */
public class Caballo extends Animal{
    //Constance
    private static final double VELOCIDAD_INICIAL = 20;
    private static final String NOT_SPECIFIED = "Asígnale uno";
    
    //Atributos
    private double velocidad_maxima;
    private String pedigree;
    
    //Constructores
    public Caballo() {
        super();
        this.raza = "Otra cosa";
        this.velocidad_maxima = VELOCIDAD_INICIAL;
        this.pedigree = NOT_SPECIFIED;
    }
    
    public Caballo(String nombre) {
        super(nombre);
        this.velocidad_maxima = VELOCIDAD_INICIAL;
        this.pedigree = NOT_SPECIFIED;
    }
}
