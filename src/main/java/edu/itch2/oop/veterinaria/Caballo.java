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

    public double getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    
    @Override
    public void comer() {
        System.out.println("Se le dieron manzanas a " + 
                this.getNombre());
    }

    @Override
    public String toString() {
        return "Caballo con nombre: " + this.getNombre() + 
                " y velocidad maxima: " + this.getVelocidad_maxima();
    }
    
    
}
