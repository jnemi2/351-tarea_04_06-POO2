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
public class Interino extends Docente{
    private String fechaIncorporacion;
    private String fechaFin;
    private float adicional;
    
    //PRE: Recibe un apellido:String, sueldoAdicional:float, fechaDeIngreso:String, fechaDeFinalizacion:String
    //POS: Crea una instancia de Interino
    public Interino(String apellido, float sueldoBasico, float adicional, String fechaIngreso, String fechaFin)
    {
        super(apellido, sueldoBasico);
        this.fechaIncorporacion = fechaIngreso;
        this.fechaFin = fechaFin;
        this.adicional = adicional;
    }
    
    //PRE: -
    //POS: Devuelve el sueldo del docente interino
    public float calcularSueldo()
    {
        return this.sueldoBasico + this.adicional;
    }
}
