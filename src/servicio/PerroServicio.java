
package servicio;

import app.Perro;
import java.util.ArrayList;
import java.util.Scanner;


public class PerroServicio {
    
    private ArrayList<Perro> listadoPerro = new ArrayList();
    Scanner consola = new Scanner(System.in);

    public ArrayList<Perro> crearPerro(){
        
        System.out.println("---- Ingrese Datos del Perro para Adopción ----");
        
        //Ingresdando automaticamente registros de perro
        listadoPerro.add(new Perro("Chiquito", "Pitbull", 6, "Grande", false));
        listadoPerro.add(new Perro("Mefistofeles", "Border Collie", 2, "Media", false));
        listadoPerro.add(new Perro("Fausto", "Chihuaha", 12, "Pequeño", false));
        listadoPerro.add(new Perro("Firulais", "Callejero", 3, "Mediano", false));
        listadoPerro.add(new Perro("Godzilla", "Micro Toy", 1, "Pequeño", false));
        listadoPerro.add(new Perro("Fenrir", "Callejero", 4, "Pequeño", false));
        listadoPerro.add(new Perro("Misky", "Peruano", 4, "Grande", false));
        
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
