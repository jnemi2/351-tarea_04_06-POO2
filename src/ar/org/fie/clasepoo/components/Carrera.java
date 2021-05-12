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
public class Carrera {
    private String nombre;
    private int plan;
    private List<Materia> materias;
    
    /** Crea una instancia de Carrera
     * 
     * @param nombre Nombre de la Carrera
     * @param plan Anio del plan de la Carrera
     */
    public Carrera(String nombre, int plan)
    {
        this.nombre = nombre;
        this.plan = plan;
        materias = new ArrayList<>();
    }
    
    /**
     * 
     * @return Una descripcion de la Carrera 
     */
    public String getPrograma()
    {
        String programa = "Carrera: " + this.nombre + " Plan: " 
                + this.plan + '\n';
        for (int i = 0; i < this.materias.size(); i++)
            programa = programa + this.materias.get(i).getDescripcion() + '\n';
        return programa;
    }
    
    /**
     * 
     * @param materia Una instancia de Materia a agregar a la Carrera
     */
    public void agregarMateria(Materia materia)
    {
        this.materias.add(materia);
    }
}
