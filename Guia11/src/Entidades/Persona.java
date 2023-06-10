/*
 */
package Entidades;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private float documento;
    ArrayList<Perro> perros;

    public Persona(String nombre, String apellido, int edad, float documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDocumento() {
        return documento;
    }

    public void setDocumento(float documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }
    
    
    
}
