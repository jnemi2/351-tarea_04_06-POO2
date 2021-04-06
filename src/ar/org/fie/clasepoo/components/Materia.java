/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.fie.clasepoo.components;

/**
 *
 * @author bauti
 */
public class Materia {
    private String nombre;
    private String codigo;
    private String modulo; //año de cursada
    private int cantidadInscriptos;
    
    //PRE: Recibe el nombre:String, codigo:String, módulo:String, y la cantidadDeInscriptos:int
    //POS: Crea una instancia de Materia
    public Materia(String nombre, String codigo, String modulo, int inscriptos)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.modulo = modulo;
        this.cantidadInscriptos = inscriptos;
    }
    
    //PRE: - 
    //POS: Devuelve un String con El nombre, año y cantidad de alumnos
    public String getDescripcion()
    {
        String text = this.nombre + " Año: " + this.modulo + " Alumnos: " + this.cantidadInscriptos;
        return text;
    }

}
