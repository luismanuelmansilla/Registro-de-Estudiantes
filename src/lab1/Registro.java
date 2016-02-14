/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void guardarCalificaciones() throws FileNotFoundException{
        
        PrintWriter pw = new PrintWriter(calificacionesCSV);
	
        pw.println("Matricula,Tarea,Nota");
        for (int i = 0; i < calificaciones.size(); i++) {
            Calificacion tempCalif = calificaciones.get(i);
            if (tempCalif != null) {
                pw.println(tempCalif);
            }
        }
        
        pw.flush(); //Descarga todo lo que se escribio 
	pw.close();//para cerar el print writer
    }
    
    public void leerEstudiantes() throws FileNotFoundException, IOException{
        
        //Leyendo el archivo
        String cadena;
        FileReader f = new FileReader("Estudiantes.csv");
        BufferedReader b = new BufferedReader(f);
        
        while((cadena = b.readLine())!=null) {
            if(cadena.trim().equals("Matricula,Nombre,Apellido")){
                continue;
            }
            else{
                String matricula = null;
                String nombre = null;
                String apellido = null;            
                String[] estudianteArray = cadena.split(",");

                matricula = estudianteArray[0];
                nombre = estudianteArray[1];
                apellido = estudianteArray[2];
                Lab1.registro.registrarEstudiante(nombre, apellido, matricula);
            }
        }
        b.close();
    }


    public void leerCalificaciones() throws FileNotFoundException, IOException{
        
        //Leyendo el archivo
        String cadena;
        FileReader f = new FileReader("Calificaciones.csv");
        BufferedReader b = new BufferedReader(f);
        
        while((cadena = b.readLine())!=null) {
            if(cadena.trim().equals("Matricula,Tarea,Nota")){
                continue;
            }
            else{
                String matricula = null;
                String tarea = null;
                String nota = null;            
                String[] calificacionesArray = cadena.split(",");
                Estudiante estudiante = null;
                
                matricula = calificacionesArray[0];
                tarea = calificacionesArray[1];
                nota = calificacionesArray[2];
                
                for(Estudiante est : Lab1.registro.estudiantes){
                    if(est.getMatricula().contains(matricula)){
                        estudiante = est;
                    }
                }
                Lab1.registro.registrarCalificacion(estudiante, tarea, nota);
            }
        }
        b.close();
    } 
    
}
