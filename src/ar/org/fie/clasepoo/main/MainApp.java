/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.fie.clasepoo.main;

import ar.org.fie.clasepoo.components.Facultad;
import ar.org.fie.clasepoo.components.Carrera;
import ar.org.fie.clasepoo.components.Docente;
import ar.org.fie.clasepoo.components.Titular;
import ar.org.fie.clasepoo.components.Interino;
import ar.org.fie.clasepoo.components.Materia;

/**
 *
 * @author bauti
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creo una instancia de Facultad
        Facultad miFacultad = new Facultad("FIE", "Cabildo 15", "+541123456789");
        
        miFacultad.agregarDocente(new Titular("Gonzales", 30000, 2));
        miFacultad.agregarDocente(new Titular("Roca", 30000, 5));
        miFacultad.agregarDocente(new Titular("Mitre", 30000, 11));
        miFacultad.agregarDocente(new Interino("Hamilton", 30000, 5500, "2020/03/01", "2021/06/26"));
        miFacultad.agregarDocente(new Interino("Harper", 30000, 7500, "2020/03/01", "2021/06/26"));
        miFacultad.agregarDocente(new Interino("Mulroney", 30000, 5595, "2020/03/01", "2021/06/26"));

        //Creo dos instancias de Carrera y las agrego a la instancia de Facultad
        Carrera carreraTemp = new Carrera("Informatica", 2015);
        carreraTemp.agregarMateria(new Materia("Tecnicas de Programacion", "351", "II", 16));
        carreraTemp.agregarMateria(new Materia("Fisica II", "167N", "II", 49));
        carreraTemp.agregarMateria(new Materia("Análisis Matemático III", "168N", "III", 52));
        miFacultad.agregarCarrera(carreraTemp);
        
        carreraTemp = new Carrera("Quimica", 1996);
        carreraTemp.agregarMateria(new Materia("Quimica General", "QG2", "II", 13));
        carreraTemp.agregarMateria(new Materia("Fisica II", "167N", "II", 49));
        miFacultad.agregarCarrera(carreraTemp);
        
        //Consulto y muestro las carreras y los sueldos
        System.out.println(miFacultad.getProgramas());
        System.out.printf(miFacultad.calcularSueldos());
    }
    
}
