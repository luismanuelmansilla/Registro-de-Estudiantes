/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author luismanuelmansilla
 */
public class Registro {
    
    protected ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
    protected ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    
    
    public void registrarEstudiante(String nombre, String apellido, String matricula){
	Estudiante est = new Estudiante(nombre, apellido, matricula);
	estudiantes.add(est);
    }
    
    
    public void registrarCalificacion(Estudiante estudiante, String tarea, String nota){
        Calificacion cal = new Calificacion(estudiante, tarea, nota);
	calificaciones.add(cal);
        
    }
    
    
    
}
