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
public class Carrera {
    private String nombre;
    private int plan;
    private List<Materia> materias;
    
    //PRE: Recibe el nombre:String, y el plan:int
    //POS: Crea una instancia de Carrera
    public Carrera(String nombre, int plan)
    {
        this.nombre = nombre;
        this.plan = plan;
        materias = new ArrayList<>();
    }
    
    //PRE: -
    //POS: Devuelve un String con el programa de la carrera
    public String getPrograma()
    {
        String programa = "Carrera: " + this.nombre + " Plan: " + this.plan + '\n';
        for (int i = 0; i < this.materias.size(); i++)
            programa = programa + this.materias.get(i).getDescripcion() + '\n';
        return programa;
    }
    
    //PRE: Recibe una instancia de Materia
    //POS: Agrega el objeto a la lista de materias de la carrera
    public void agregarMateria(Materia materia)
    {
        this.materias.add(materia);
    }
}
