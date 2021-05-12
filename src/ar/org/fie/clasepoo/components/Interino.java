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
public class Interino extends Docente{
    private String fechaIncorporacion;
    private String fechaFin;
    private float adicional;
    
    /** Crea una instancia de Docente Interino
     * 
     * @param apellido Apellido del Docente
     * @param sueldoBasico Sueldo basico del Docente 
     * @param adicional Sueldo adicional del Docente
     * @param fechaIngreso Fecha de incorporacion. Formato aaaa/mm/dd
     * @param fechaFin Fecha de termino del contrato. Formato aaaa/mm/dd
     */
    public Interino(String apellido, float sueldoBasico, float adicional, 
            String fechaIngreso, String fechaFin)
    {
        super(apellido, sueldoBasico);
        this.fechaIncorporacion = fechaIngreso;
        this.fechaFin = fechaFin;
        this.adicional = adicional;
    }
    
    /**
     * 
     * @return el valor correspondiente al sueldo que debe cobrar
     */
    @Override
    public float calcularSueldo()
    {
        return this.sueldoBasico + this.adicional;
    }
}
