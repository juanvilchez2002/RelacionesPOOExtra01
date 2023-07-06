
package entidad;

import app.Perro;
import app.Persona;
import java.util.ArrayList;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class App {
    
/**
 *  Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
 */

    public static void main(String[] args) {
        
        PerroServicio ps = new PerroServicio();
        ArrayList<Perro> listaPerro = ps.crearPerro();
        
        PersonaServicio pse = new PersonaServicio();
        ArrayList<Persona> listaPersona = pse.crearPersona();
        
        pse.adoptarPerro(listaPerro, listaPersona);

    }
    
}
