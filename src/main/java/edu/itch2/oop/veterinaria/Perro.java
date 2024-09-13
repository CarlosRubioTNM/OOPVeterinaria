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
public class Perro {
    //Atributos
    private int noRegistro;
    private String nombre;
    private String tipoSangre;
    private String raza;
    private double peso;
    private ArrayList alergias = new ArrayList();
    private String color;
    private String dueno;
    private double altura;
    private ArrayList vacunas = new ArrayList();
    private Date fechaNacimiento;
    private ArrayList enfermedades = new ArrayList();
    private ArrayList consultas = new ArrayList();
    
    
    //Métodos
    public void setNombre(String n) {
        //Código anidado
        /*if (!n.equals("")) {
            this.nombre = n;
        } else {
            System.out.println("Pobre criatura, "
                    + "no le quites el nombre.");
        }*/
        
        //Código plano
        n = n.trim();
        if (n.equals("")) {
            System.out.println("Pobre criatura, "
                    + "no le quites el nombre.");
            return;
        }
        
        this.nombre = n;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public int getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(int noRegistro) {
        this.noRegistro = noRegistro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList getAllAlergias() {
        return alergias;
    }
    
    public String getAlergia(int index) {
        if (index >= this.alergias.size() || index < 0) {
            return "Alergia no disponible";
        }
        return (String) this.alergias.get(index);
    }
    
    public void addAlergia(String alergia) {
        this.alergias.add(alergia);
    }
    
    public void removeAlergia(int index) {
        this.alergias.remove(index);
    }
    
    public void editAlergia(int index, String alergia) {
        this.alergias.remove(index);
        this.alergias.add(index, alergia);
    }
    
    public int getSizeAlergias() {
        return this.alergias.size();
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList vacunas) {
        this.vacunas = vacunas;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList consultas) {
        this.consultas = consultas;
    }
    
    
    
}


