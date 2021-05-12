/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.fie.clasepoo.components;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @author bauti
 */
public class Facultad {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Docente> docentes;
    private List<Carrera> carreras;
    
    /** Constructor de Facultad
     * @param nombre El nombre de la Facultad
     * @param direccion Direccion de la Facultad
     * @param tel Telefono de la Facultad
     */
    public Facultad(String nombre, String direccion, String tel)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = tel;
        docentes = new ArrayList<>();
        carreras = new ArrayList<>();
    }
    
    /**
     * Agrega un docente a la lista de la Facultad
     * @param docente objeto Docente a incorporar 
     */
    public void agregarDocente(Docente docente)
    {
        docentes.add(docente);
    }
    
    /**
     * Agrega una carrera a la Facultad
     * @param carrera objeto Carrera a agregar
     */
    public void agregarCarrera(Carrera carrera)
    {
        carreras.add(carrera);
    }
    
    /**
     * 
     * @return La nomina de sueldos a pagar de la Facultad. 
     */
    public String calcularSueldos()
    {
        String resumen = "";
        float sueldos = 0;
        Docente docente;
        for (int i = 0; i < this.docentes.size(); i++)
        {
            docente = this.docentes.get(i);
            float sueldo = docente.calcularSueldo();
            //sueldos acumula el total de sueldos
            sueldos += sueldo;
            //resumen acumula las nóminas de los docentes
            resumen = resumen + docente.getApellido() + ", $" + sueldo + '\n';
        }
        
        //se agrega el total de sueldos a pagar al principio de resumen
        resumen = "La Facultad " + this.nombre + " tiene "
                + this.docentes.size() + " docentes, y un total a pagar de: $"
                + sueldos + "\n\n" + resumen;
        
        return resumen;
    }
    
    /**
     * 
     * @return El programa de las carreras de la Facultad
     */
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
