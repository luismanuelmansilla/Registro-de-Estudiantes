/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author luismanuelmansilla
 */
public class Calificacion {
    Estudiante estudiante;
    String tarea;
    String nota;

    public Calificacion(Estudiante estudiante, String tarea, String nota) {
        this.estudiante = estudiante;
        this.tarea = tarea;
        this.nota = nota;
    }
    
    

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public String toString(){
		return estudiante.getMatricula() + "," + tarea +  "," + nota + "\n"; 		
    }
    
}
