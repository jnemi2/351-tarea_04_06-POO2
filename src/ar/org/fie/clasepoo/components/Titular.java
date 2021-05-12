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
public class Titular extends Docente {
    private int antiguedad;
    
    /** Crea una instancia de Docente Titular
     * 
     * @param apellido Apellido del Docente
     * @param sueldoBasico Sueldo basico del Docente
     * @param antiguedad Antiguedad del Docente en anios
     */
    public Titular(String apellido, float sueldoBasico, int antiguedad)
    {
        super(apellido, sueldoBasico);
        this.antiguedad = antiguedad;
    }
    
    /**
     * 
     * @return el valor correspondiente al sueldo que debe cobrar
     */
    @Override
    public float calcularSueldo()
    {
        float sueldoBruto = this.sueldoBasico;
        if (this.antiguedad < 5)
            sueldoBruto += 5000;
        else if (this.antiguedad < 10)
            sueldoBruto += 8000;
        else
            sueldoBruto += 12000;
        
        return sueldoBruto;
    }
}
