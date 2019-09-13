
package pruebaclase;


public class Persona {

    private String nombre;
    private int edad;
    private String nacionalidad;
    
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void establecerEdad(int edad)
    {
        this.edad = edad;
    }
    public int obtenerEdad()
    {
        return edad;
    }
    public void establecerNacionalidad(String nacionalidad)
    {
        this.nacionalidad= nacionalidad;
    }
    public String obtenerNacionalidad()
    {
        return nacionalidad;
    }


    
}
