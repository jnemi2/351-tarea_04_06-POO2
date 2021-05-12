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
public class Titular extends Docente {
    private int antiguedad;
    
    //PRE: Recibe un String como apellido y un entero con la antiguedad en años
    //POS: Crea una instancia de docente Titular
    public Titular(String apellido, float sueldoBasico, int antiguedad)
    {
        super(apellido, sueldoBasico);
        this.antiguedad = antiguedad;
    }
    
    //PRE: - 
    //POS: Devuelve el sueldo del docente
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
