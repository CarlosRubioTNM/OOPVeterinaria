/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

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
        //String alergia = perro.getAlergia(60);
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
        
        //Ejemplo de IndexOutOfBoundsException
        //ArrayList<String> lista = new ArrayList<>();
        //System.out.println(lista.get(5));
        /*int []califas = new int[4]; //Arreglo de elementos
        califas[0] = 100;
        califas[1] = 100;
        califas[2] = 100;
        califas[3] = 100;
        //ArrayIndexOutOfBoundsException
        System.out.println(califas[4]);*/
        
        //Ejemplo NullPointerException
        /*Caballo fir = new Caballo();
        fir.lista_tronar.add("Hola");*/
        
        //Ejemplo ArithmeticException
        /*int num = 10;
        int den = 0;
        System.out.println(num/den);*/
        
        //Ejemplo NumberFormatException
        /*System.out.println("Proporciona un número entero:");
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.next();
        int valorEntero = 0;
        try {
            valorEntero = Integer.parseInt(valor);
            System.out.println("Escribiste: " + (valorEntero*2));
        } catch (NumberFormatException e) {
            System.out.println("La regaste! no te pases de lanza. Te dije que necesitaba un número entero.");
        }*/
        
        //Lanzar nuestras propias excepciones
        
        /*try {
            firulais.getAlergia(15);
        } catch(IndexOutOfBoundsException e) {
            
        }*/
        
        //Leer archivo
        File miArchivo = new File("E:\\Embebidos\\archivo.txt");
        Scanner sc;
        try {
            sc = new Scanner(miArchivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo.");
        }
        
        //Escribir archivo
        try {
            File nuevoArchivo = new File("archivo12nov.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoArchivo, true));
            //Sobreescribir el archivo.
            writer.newLine();
            writer.write("Otras cosas."); 
            //Añadir texto al archivo
            writer.newLine();
            writer.write("Texto extra!");
            writer.close();
            System.out.println("LISTO!");
        } catch (IOException ex) {
            System.out.println("No se pudo escribir en el archivo.");
        }
    }
  
}



