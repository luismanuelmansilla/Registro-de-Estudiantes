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
    
    public static void main() {
        // TODO code application logic here
    
    Scanner sc = new Scanner(System.in);
    String opcion;
    
    do{
        
        System.out.print(
				"Seleccione una opción:\n"
			+	"1) Registrar un nuevo estudiante.\n"
			+	"2) Borrar un estudiante.\n"
			+	"3) Registrar una calificación para un estudiante.\n"
			+	"4) Salir.\n"
			+   "=>"
			);
        opcion = sc.next();
        /*
        switch(opcion){
		
			case "1": //registrarEstudiante();
			break;
			
			case "2": 
				System.out.print("\n");
				if(libreta.contactos.isEmpty()){
					System.out.println("No hay contactos agregados a la libreta.\n");	
				}else{
					libreta.listarContacto();
				}
			break;
			
			case "3": 
				System.out.print("\n");
				buscarContacto();
			break;
			
			case "4": System.out.println("Hasta la proxima!");
			break;
			
			default: System.out.println("Error opcion no valida!\n");
			}*/
		}while(!opcion.equals("4"));
   
    
    
    }
}