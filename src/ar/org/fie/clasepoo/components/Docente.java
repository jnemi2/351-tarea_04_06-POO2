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
public abstract class Docente {
    protected String apellido;
    protected float sueldoBasico = 30000;
    
    /** Construye una instancia de un objeto que hereda de Docente
     * 
     * @param apellido Apellido del docente
     * @param sueldoBasico Sueldo basico del docente
     */
    public Docente(String apellido, float sueldoBasico)
    {
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }
    
    /**
     * 
     * @return el apellido del Docente
     */
    public String getApellido()
    {
        return this.apellido;
    }
    
    /**
     * 
     * @return el valor correspondiente al sueldo que debe cobrar
     */
    public abstract float calcularSueldo();

}
