/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Rubio
 */
public class Principal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        //perro.tipoSangre = "O-";
        //Cuando el atributo es default o publico
        //perro.nombre = "Firulais";
        //System.out.println(perro.nombre);
        
        //Cuando el atributo es privado
        perro.setNombre("Firulais 2nd");
        if (perro.getNombre() != null) {
            System.out.println(perro.getNombre());
        }
       
        perro.addAlergia("Soya");
        perro.addAlergia("Pino");
        perro.addAlergia("Cesped");
        perro.addAlergia("Huevo");
        perro.addAlergia("Lacteos");
        perro.removeAlergia(3);
        String alergia = perro.getAlergia(60);
        ArrayList alergias = perro.getAllAlergias();
        System.out.println(alergias);
        System.out.println("La alergia de " + perro.getNombre() + " es: " + alergia);
    }
  
}



