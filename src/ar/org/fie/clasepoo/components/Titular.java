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
    private final int ANTIGUEDAD_INFERIOR = 5; //Limite años antiguedad inferior
    private final int ANTIGUEDAD_SUPERIOR = 10;//Limite años antiguedad superior
    private final float ADICIONAL_BAJO = 5000; //Sueldo extra bajo
    private final float ADICIONAL_MEDIO = 8000;//Sueldo extra medio
    private final float ADICIONAL_ALTO = 12000;//Sueldo extra alto
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
        if (this.antiguedad < ANTIGUEDAD_INFERIOR)
            sueldoBruto += ADICIONAL_BAJO;
        else if (this.antiguedad < ANTIGUEDAD_SUPERIOR)
            sueldoBruto += ADICIONAL_MEDIO;
        else
            sueldoBruto += ADICIONAL_ALTO;
        
        return sueldoBruto;
    }
}
