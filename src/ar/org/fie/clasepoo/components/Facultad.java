/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.fie.clasepoo.components;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bauti
 */
public class Facultad {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Docente> docentes;
    private List<Carrera> carreras;
    
    //PRE: Recibe el nombre, direccion y telefono de la Facultad
    //POS: Contruye una instancia del objeto con los datos recibidos
    public Facultad(String nombre, String direccion, String tel)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = tel;
        docentes = new ArrayList<>();
        carreras = new ArrayList<>();
    }
    
    //PRE: Recibe una instancia de Docente
    //POS: Agrega el objeto a la lista de docentes
    public void agregarDocente(Docente docente)
    {
        docentes.add(docente);
    }
    
    //PRE: Recibe una instancia de Carrera
    //POS: Agrega el objeto a la lista de carreras
    public void agregarCarrera(Carrera carrera)
    {
        carreras.add(carrera);
    }
    
    //PRE: -
    //POS: Devuelve un String con el total de sueldos a pagar y el detalle por docente
    public String calcularSueldos()
    {
        String resumen = "";
        float sueldos = 0;
        Docente d;
        for (int i = 0; i < this.docentes.size(); i++)
        {
            d = this.docentes.get(i);
            float sueldo = d.calcularSueldo();
            //sueldos acumula el total de sueldos
            sueldos += sueldo;
            //resumen acumula las nóminas de los docentes
            resumen = resumen + d.getApellido() + ", $" + sueldo + '\n';
        }
        
        //se agrega el total de sueldos a pagar al principio de resumen
        resumen = "La Facultad " + this.nombre + " tiene " + this.docentes.size() + " docentes, y un total a pagar de: $" + sueldos + "\n\n" + resumen;
        
        return resumen;
    }
    
    //PRE: -
    //POS: Devuelve un String con los programas de las carreras de la Facultad
    public String getProgramas()
    {
        String programa = "Facultad: " + this.nombre + "\n\n";
        for (int i = 0; i < this.carreras.size(); i++)
        {
            //Agrega el programa de cada Carrera
            programa = programa + this.carreras.get(i).getPrograma() + '\n';
        }
        return programa;
    }
}
