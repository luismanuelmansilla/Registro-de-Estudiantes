/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author luismanuelmansilla
 */
public class Lab1 {
    
    public static Registro registro = new Registro();
    
    public static void main(String args[]) throws FileNotFoundException {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    String opcion;
    
    do{
        System.out.println("\n\t\t Laboratorio 1 Tecnicas \n");
        System.out.print(
				"1) Registrar un nuevo estudiante.\n"
			+	"2) Borrar un estudiante.\n"
			+	"3) Registrar una calificación para un estudiante.\n"
			+	"4) Salir.\n"
			+   "Seleccione una opción=>"
			);
        opcion = sc.next();
        
            switch(opcion){
		
			case "1": registrarEstudiante();
			break;
			
			case "2": 
                            System.out.print("\n");
                            if(registro.estudiantes.isEmpty()){
                                System.out.println("No hay estudiantes registrados. \n");	
                            }else{
                                borrarEstudiante();
                            }
			break;
			
			case "3": 
                            System.out.print("\n");
				if(registro.estudiantes.isEmpty()){
					System.out.println("No hay estudiantes registrados. \n");	
				}else{
                                        registrarCalificacion();
				}
                            
                            
                           
			break;
			
			case "4": 
                            registro.guardarCalificaciones();
                            registro.guardarEstudiantes();
                            
                            System.out.println("Gracias por usar el programa, hasta la próxima!!\n");
			break;
			
			default: System.out.println("Error! Opción no valida!\n");
            }
        }while(!opcion.equals("4")); 
    }
    
    public static void registrarEstudiante(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t Registrar estudiante\n");
        System.out.print("Matricula: "); 
	String matricula = sc.nextLine();
        System.out.print("Nombre: "); 
	String nombre = sc.nextLine();
	System.out.print("Apellido: ");
	String apellido = sc.nextLine();
        
        registro.registrarEstudiante(nombre, apellido, matricula);
        System.out.println("\n--Estudiante registrado con éxito!--\n");
        
    }
    
    public static void registrarCalificacion(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t Registrar calificación de estudiante\n");
        System.out.print("Matricula del estudiante: "); 
	
        String matricula = sc.nextLine();
        Estudiante estudiante = null;
        boolean error = false;
        
        for(Estudiante est : registro.estudiantes){
            
            if(est.getMatricula().contains(matricula)){
                estudiante = est;
                System.out.print("Tarea: "); 
                String tarea = sc.nextLine();
                System.out.print("Nota: ");
                String nota = sc.nextLine();
        
                registro.registrarCalificacion(estudiante, tarea, nota);
                System.out.println("\n--Calificación registrada con éxito!--\n");
            }
            error = true;
	}
        
        if(error == true){
            System.out.println("La matricula introducida no corresponde a ningun estudiante");
        }

    }
    
    public static void borrarEstudiante(){
        
        
        
        
    }
    
    
    
}