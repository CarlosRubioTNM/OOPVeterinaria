/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        /*if (perro.getNombre() != null) {
            System.out.println(perro.getNombre());
        }*/
       
        perro.addAlergia("Soya");
        perro.addAlergia("Pino");
        perro.addAlergia("Cesped");
        perro.addAlergia("Huevo");
        perro.addAlergia("Lacteos");
        perro.removeAlergia(3);
        String alergia = perro.getAlergia(60);
        ArrayList alergias = perro.getAllAlergias();
        //System.out.println(alergias);
        //System.out.println("La alergia de " + perro.getNombre() + " es: " + alergia);
        perro.generarRegistro();
        Perro solovino = new Perro();
        solovino.setNombre("solovino");
        solovino.setAltura(0.4);
        solovino.setPeso(20);
        solovino.setFechaNacimiento(new Date(2015, 9, 21));
        solovino.generarRegistro();
        //System.out.println("El registro de " + perro.getNombre() + " es: " + perro.getNoRegistro());
        //System.out.println("El registro de " + solovino.getNombre() + " es: " + solovino.getNoRegistro());
        Perro max = new Perro();
        //System.out.println(max.getNoRegistro());
        Perro min = max;
        //System.out.println(min.getNoRegistro());
        Perro flash = new Perro("Chihuahua", "Flash");
        
        //System.out.println(flash.getNombre());
        //System.out.println(flash.getRaza());
        int a = 5;
        int b = 5;
        
        Perro firulais = new Perro("Firulais");
        Date firulais2 = new Date();
        if (firulais.equals(firulais2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        
        Gato michi = new Gato("Siames", "Michi");
        System.out.println("Hola " + michi.getNombre() + "!");
        Perro frijol = new Perro("Salchicha", "Frijol");
        System.out.println("Hola " + frijol.getNombre() + "!");
        Perro otro = new Perro();
        System.out.println(otro.getRaza());
        
        Caballo lucero = new Caballo("Lucero");
        System.out.println("Hola! " + lucero.getNombre() + ".");
        
        //Animal a1 = new Animal();
        Animal a1 = new Caballo("Prancer");
        System.out.println(a1.getNombre());
        Caballo c1 = (Caballo) a1;
        System.out.println(c1.getVelocidad_maxima());
        c1.setVelocidad_maxima(60);
        System.out.println(solovino);
        
        Gato felix = new Gato();
        
        
        
        //System.out.println(c1.getNombre());
        
        
        
        
        /****************************
         * Excepciones
         ****************************/
        //Ejemplo de ClassCastException
        //Date d1 = (Date) firulais; //Error de compilación: incompatible types
        //Object miObjeto = new Perro();
        //Date d = (Date) miObjeto;//ClassCastException
    }
  
}



