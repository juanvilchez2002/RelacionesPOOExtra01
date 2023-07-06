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
        
        //Ingresando registros automaticamente
        listadoPersona.add(new Persona("Amilcar", "Marx",48 , null, null));
        listadoPersona.add(new Persona("Juan", "Rafaga", 25 , null, null));
        listadoPersona.add(new Persona("Carolina", "Mejia", 31 , null, null));
        listadoPersona.add(new Persona("Jorge David", "Gonzalez",25 , null, null));
        listadoPersona.add(new Persona("Pablo Andres", "Matuzalem",17 , null, null));
        listadoPersona.add(new Persona("Patricia", "Aparicio",21 , null, null));
        listadoPersona.add(new Persona("Juan Ignacio", "Autista",18 , null, null));

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
            listadoPersona.add(new Persona(nombre, apellido, edad, documento, null));
            
            System.out.println("Registro realizado!!!");
            
            System.out.println("¿Desea registrar otro Perro? (Si/No)");
            String seguirRegistrado = consola.nextLine();
            
            if(seguirRegistrado.equalsIgnoreCase("no")){
                 break;
            }            
        }while(true);
        
        return listadoPersona;
    }
    
    public void adoptarPerro(ArrayList<Perro> listaPerro, ArrayList<Persona> listadoPersona){
        
        System.out.println("--- Adoptar Perro ---");
        System.out.print("Nombre del Adoptante: ");
        String nombre = consola.nextLine();
        System.out.print("Apellido del Adoptante: ");
        String apellido = consola.nextLine();
        
        int index=0;
        //validando si el adoptante se encuentra registrado
        for(Persona adoptante: listadoPersona){
            index+=1;
            if(adoptante.getNombre().equalsIgnoreCase(nombre) && adoptante.getApellido().equalsIgnoreCase(apellido)){
                System.out.println("Encontrado en el registro: "+(index-1));
            }
        }
        
        System.out.println("--- Listado de Perros Disponibles ---");
        System.out.println("Nombre\tRaza\tTamaño\tEdad");
        for(Perro per: listaPerro){     
            if(!per.isAdoptado()){
                System.out.println(per.getNombre()+"\t"+per.getRaza()+"\t"+per.getTamano()+"\t"+per.getEdad());
            }
        }
        
        System.out.print("Ingrese nombre del perro a adoptar: ");
        String nombrePerro = consola.nextLine();
    } 
}
