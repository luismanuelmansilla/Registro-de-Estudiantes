/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author luismanuelmansilla
 */
public class Lab1 {
    
    public static Registro registro = new Registro();
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        // TODO code application logic here
    
    String opcion;
    
    do{
        
        System.out.print(
				"\n\t\t Laboratorio 1 Tecnicas"
			+	"1) Registrar un nuevo estudiante.\n"
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
			
			case "3": registrarCalificacion();
			break;
			
			case "4": System.out.println("Gracias por usar el programa, hasta la próxima!!\n");
			break;
			
			default: System.out.println("Error! Opción no valida!\n");
            }
        }while(!opcion.equals("4")); 
    }
    
    public static void registrarEstudiante(){
        
        clearConsole();
        System.out.println("\t\t Registrar estudiante");
        System.out.println("\n Matricula: "); 
	String matricula = sc.nextLine();
        System.out.println("\n Nombre: "); 
	String nombre = sc.nextLine();
	System.out.println("Apellido: ");
	String apellido = sc.nextLine();
        
        registro.registrarEstudiante(nombre, apellido, matricula);
        System.out.println("\n--Estudiante registrado con éxito! Presione cualquier tecla para regresar al menú principal--\n");
        
    }
    
    public static void registrarCalificacion(){
        
        clearConsole();
        System.out.println("\t\t Registrar calificación de estudiante\n");
        System.out.println("\n Matricula del estudiante: "); 
	
        String matricula = sc.nextLine();
        Estudiante estudiante = null;
        
        for(Estudiante est : registro.estudiantes){
            if(est.getMatricula().contains(matricula)){
                est = estudiante;
            }
            System.out.println("La matricula introducida no corresponde a ningun estudiante");
            return ;
	}
        
        System.out.println("\n Tarea: "); 
	String tarea = sc.nextLine();
	System.out.println("\n Nota: ");
	String nota = sc.nextLine();
        
        registro.registrarCalificacion(estudiante, tarea, nota);
        System.out.println("\n--Calificación registrada con éxito! Presione cualquier tecla para regresar al menú principal--\n");
    }
    
    public static void borrarEstudiante(){
        
        
        
        
    }
    
    public final static void clearConsole(){
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
            Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    
}