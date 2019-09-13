
package pruebaclase;

import java.util.Scanner;

public class PruebaClase {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    String nombre;
    String nacionalidad;
    int edad;
    
      Persona persona1 = new Persona ();
      
      System.out.printf("el nombre inicial es: %s%n%n", persona1.obtenerNombre());
      System.out.println("Cual es el nombre?");
      nombre = leer.nextLine();
      persona1.establecerNombre(nombre);
      
      System.out.printf("la edad inicial es: %s%n%n", persona1.obtenerEdad());
      System.out.println("Cual es la edad?");
      edad = leer.nextInt();
      persona1.establecerEdad(edad);
      
      System.out.printf("la edad inicial es: %s%n%n", persona1.obtenerNacionalidad());
      System.out.println("Cual es la nacionalidad?");
      nacionalidad = leer.nextLine();
      persona1.establecerNacionalidad(nacionalidad);
      
      
      
        
    }
    
}
