/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.fie.clasepoo.components;

/**
 * @version 1.0.1
 * @author bauti
 */
public class Materia {
    private String nombre;
    private String codigo;
    private String modulo; //año de cursada
    private int cantidadInscriptos;
    
    /** Crea una instancia de Materia
     * 
     * @param nombre Nombre de la Materia
     * @param codigo Codigo de la Materia
     * @param modulo Anio correspondiente a la materia
     * @param inscriptos Cantidad de alumnos inscriptos a la Materia
     */
    public Materia(String nombre, String codigo, String modulo, int inscriptos)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.modulo = modulo;
        this.cantidadInscriptos = inscriptos;
    }
    
    /**
     * 
     * @return Una descripcion con el nombre, anio y cantidad de alumnos
     */
    public String getDescripcion()
    {
        String text = "(" + this.codigo + ") " + this.nombre + " Año: " 
                + this.modulo + " Alumnos: " + this.cantidadInscriptos;
        return text;
    }

}
