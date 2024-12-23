/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.itch2.oop.veterinaria;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase abstracta de un Animal en el contexto de una veterinaria
 * @author Carlos Rubio
 * @version 0.2.1
 */
public abstract class Animal {
    //Atributos
    protected int noRegistro;
    protected String nombre;
    protected String tipoSangre;
    protected String raza;
    protected double peso;
    protected ArrayList<String> alergias;
    protected String color;
    protected String dueno;
    protected double altura;
    protected ArrayList<String> vacunas;
    protected Date fechaNacimiento;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> consultas;
    
    //Constructor
    /**
     * Constructor sin argumentos que coloca valores por defecto
     */
    public Animal() {
        this.alergias = new ArrayList();
        this.vacunas = new ArrayList();
        this.enfermedades = new ArrayList();
        this.consultas = new ArrayList();
        this.nombre = "Dato no establecido";
        this.raza = "Dato no establecido";
        this.dueno = "Dato no establecido";
        this.color = "Dato no establecido";
        this.tipoSangre = "Dato no establecido";
        this.fechaNacimiento = new Date();
        this.generarRegistro();
    }
    
    /**
     * Constructor donde se define el nombre del animal
     * @param nombre Nombre del animal 
     */
    public Animal(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    /**
     * Constructor que define la raza y el nombre del animal
     * @param raza Raza del animal
     * @param nombre Nombre del animal
     */
    public Animal(String raza, String nombre) {
        this();
        this.nombre = nombre;
        this.raza = raza;
    }
    
    
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

    public void generarRegistro() {
        this.noRegistro = this.hashCode();
        /*LocalDateTime temp = LocalDateTime.now();
        this.noRegistro = temp.getYear() + temp.getMonthValue() + 
                temp.getDayOfMonth() + temp.getHour() + 
                temp.getMinute() + temp.getSecond() + temp.getNano() + this.nombre.hashCode();*/
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
    
    /**
     * Obtiene la alergia determinada por el índice proporcionado
     * @param index Índice de la alergia a obtener
     * @return Alergia requerida
     * @throws IndexOutOfBoundsException Si el índice es inválido
     */
    public String getAlergia(int index) throws IndexOutOfBoundsException {
        if (index >= this.alergias.size() || index < 0) {
            //return "Alergia no disponible";
            //Con excepciones
            throw new IndexOutOfBoundsException("No existe una alergia en este índice.");
        }
        
        return this.alergias.get(index);
    }
    
    public void addAlergia(String alergia) {
        this.alergias.add(alergia);
    }
    
    public boolean removeAlergia(int index) {
        if (index >= this.alergias.size() || index < 0) {
            return false;
        }
        this.alergias.remove(index);
        return true;
    }
    
    public boolean editAlergia(int index, String alergia) {
        if (index >= this.alergias.size() || index < 0) {
            return false;
        }
        this.alergias.remove(index);
        this.alergias.add(index, alergia);
        return true;
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

    public ArrayList getAllVacunas() {
        return vacunas;
    }
    
    public String getVacuna(int index) {
        if (index >= this.vacunas.size() || index < 0) {
            return "Vacuna no disponible";
        }
        return this.vacunas.get(index);
    }
    
    public void addVacunas(String vacuna) {
        this.vacunas.add(vacuna);
    }
    
    public boolean removeVacuna(int index) {
        if (index >= this.vacunas.size() || index < 0) {
            return false;
        }
        this.vacunas.remove(index);
        return true;
    }
    
    public boolean editVacuna(int index, String vacuna) {
        if (index >= this.vacunas.size() || index < 0) {
            return false;
        }
        this.vacunas.remove(index);
        this.vacunas.add(index, vacuna);
        return true;
    }
    
    public int getSizeVacuna() {
        return this.vacunas.size();
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList getAllEnfermedades() {
        return vacunas;
    }
    
    public String getEnfermedad(int index) {
        if (index >= this.enfermedades.size() || index < 0) {
            return "Vacuna no disponible";
        }
        return this.enfermedades.get(index);
    }
    
    public void addEnfermedades(String enfermedad) {
        this.enfermedades.add(enfermedad);
    }
    
    public boolean removeEnfermedad(int index) {
        if (index >= this.enfermedades.size() || index < 0) {
            return false;
        }
        this.enfermedades.remove(index);
        return true;
    }
    
    public boolean editEnfermedad(int index, String enfermedad) {
        if (index >= this.enfermedades.size() || index < 0) {
            return false;
        }
        this.enfermedades.remove(index);
        this.enfermedades.add(index, enfermedad);
        return true;
    }
    
    public int getSizeEnfermedad() {
        return this.enfermedades.size();
    }

    public ArrayList getAllConsultas() {
        return consultas;
    }
    
    public String getConsulta(int index) {
        if (index >= this.consultas.size() || index < 0) {
            return "Vacuna no disponible";
        }
        return this.consultas.get(index);
    }
    
    public void addConsulta(String consulta) {
        this.consultas.add(consulta);
    }
    
    public boolean removeConsulta(int index) {
        if (index >= this.consultas.size() || index < 0) {
            return false;
        }
        this.consultas.remove(index);
        return true;
    }
    
    public boolean editConsulta(int index, String consulta) {
        if (index >= this.consultas.size() || index < 0) {
            return false;
        }
        this.consultas.remove(index);
        this.consultas.add(index, consulta);
        return true;
    }
    
    public int getSizeConsulta() {
        return this.consultas.size();
    }
    
    public abstract void comer();

    @Override
    public String toString() {
        Object o = new Object();
        return "Animal con nombre: " + this.getNombre() + " y dueño" + this.getDueno();
    }
    
    

}
