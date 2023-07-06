/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import app.Perro;
import app.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JUAN VILCHEZ
 */
public class PersonaServicio {
    
    private ArrayList<Persona> listadoPersona = new ArrayList();
    Scanner consola = new Scanner(System.in);
    
    public ArrayList<Persona> crearPersona(){
        System.out.println("---- Ingrese Datos del Personas para Adopción ----");
        
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.edad = edad;
//        this.documento = documento;
//        this.perro = perro; 
        do{
            System.out.print("Ingrese nombre: ");
            String nombre = consola.nextLine();
            System.out.print("Ingrese apellido: ");
            String apellido = consola.nextLine();
            System.out.print("Ingrese documento ");
            String documento = consola.nextLine();
            System.out.print("Ingrese edad: ");
            int edad = consola.nextInt();
            
            consola.nextLine();
            listadoPersona.add(new Persona(nombre, apellido, edad, documento));
            
            System.out.println("Registro realizado!!!");
            
            System.out.println("¿Desea registrar otro Perro? (Si/No)");
            String seguirRegistrado = consola.nextLine();
            
            if(seguirRegistrado.equalsIgnoreCase("no")){
                 break;
            }            
        }while(true);
        
        return listadoPersona;
    }
    
    public void adoptarPerro(ArrayList<Perro> perro, ArrayList<Persona> listadoPersona){
        
        
    } 
}
