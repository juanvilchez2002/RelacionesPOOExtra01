
package servicio;

import app.Perro;
import java.util.ArrayList;
import java.util.Scanner;


public class PerroServicio {
    
    private ArrayList<Perro> listadoPerro = new ArrayList();
    Scanner consola = new Scanner(System.in);

    public ArrayList<Perro> crearPerro(){
        System.out.println("---- Ingrese Datos del Perro para Adopción ----");
        
        do{
            System.out.print("Ingrese nombre: ");
            String nombre = consola.nextLine();
            System.out.print("Ingrese raza: ");
            String raza = consola.nextLine();
            System.out.print("Tamaño (Chico, Mediano, Grrande): ");
            String tamano = consola.nextLine();
            System.out.print("Ingrese edad: ");
            int edad = consola.nextInt();
            
            consola.nextLine();
            listadoPerro.add(new Perro(nombre, raza, edad, tamano, false));
            
            System.out.println("Registro realizado!!!");
            
            System.out.println("¿Desea registrar otro Perro? (Si/No)");
            String seguirRegistrado = consola.nextLine();
            
            if(seguirRegistrado.equalsIgnoreCase("no")){
                 break;
            }            
        }while(true);
        
        return listadoPerro;
    }
    
    
    
}
