/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author luismanuelmansilla
 */
public class Registro {
    
    protected ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
    protected ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    
    File estudiantesCSV = new File("Estudiantes.csv");
    File calificacionesCSV = new File("Calificaciones.csv");
    
    public void registrarEstudiante(String nombre, String apellido, String matricula){
	Estudiante est = new Estudiante(nombre, apellido, matricula);
	estudiantes.add(est);
    }
    
    
    public void registrarCalificacion(Estudiante estudiante, String tarea, String nota){
        Calificacion cal = new Calificacion(estudiante, tarea, nota);
	calificaciones.add(cal);
        
    }
    
    public void guardarEstudiantes() throws FileNotFoundException{
        
        PrintWriter pw = new PrintWriter(estudiantesCSV);
	
        pw.println("Matricula,Nombre,Apellido");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante tempEst = estudiantes.get(i);
            if (tempEst != null) {
                pw.println(tempEst);
            }
        }
        
        pw.flush(); //Descarga todo lo que se escribio 
	pw.close();//para cerar el print writer
    }
    
    
    
}
