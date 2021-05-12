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
public abstract class Docente {
    protected String apellido;
    protected float sueldoBasico = 30000;
    
    //PRE: Recibe un String como apellido
    //POS: Crea una instancia de Docente
    public Docente(String apellido, float sueldoBasico)
    {
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }
    
    //PRE: -
    //POS: Devuelve el apellido de la instancia de Docente
    public String getApellido()
    {
        return this.apellido;
    }
    
    public abstract float calcularSueldo();

}
