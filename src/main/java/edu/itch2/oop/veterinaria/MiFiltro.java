package edu.itch2.oop.veterinaria;


import java.io.File;
import javax.swing.filechooser.FileFilter;
import jdk.jshell.execution.Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Rubio
 */
public class MiFiltro extends FileFilter {

    @Override
    public boolean accept(File f) {
        String ext = f.getName().substring(f.getName().length()-3);
        return ext.equals(".cbl");
    }

    @Override
    public String getDescription() {
        return "Archivo de caballos.";
    }
    
}
