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
    
    public String getAlergia(int index) {
        if (index >= this.alergias.size() || index < 0) {
            return "Alergia no disponible";
        }
        return (String) this.alergias.get(index);
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
        return (String) this.vacunas.get(index);
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
        return (String) this.enfermedades.get(index);
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
        return (String) this.consultas.get(index);
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
    
    
    
}


