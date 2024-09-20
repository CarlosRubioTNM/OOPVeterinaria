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
        Perro weiofneoi = max.clone();
        //System.out.println(min.getNoRegistro());
        Perro flash = new Perro("Chihuahua", "Flash");
        //System.out.println(flash.getNombre());
        //System.out.println(flash.getRaza());
        int a = 5;
        int b = 5;
        
        min.setRaza("Xoloesquincle");
        min = new Perro();
        System.out.println(max);
        System.out.println(min);
        if (max == min) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        
        
    }
  
}



