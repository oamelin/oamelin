/*
*/
package Entidades;

import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        System.out.print("Ingresar nombre: ");
        this.nombre = leer.nextLine();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad() {
        System.out.println("Ingrese la edad: ");
        this.edad = leer.nextInt();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo() {
        String op;
        do
        {
            System.out.print("Ingrese sexo (H-M-O): ");
            op=leer.next().toUpperCase();
        }while (op.equals('H') || op.equals('M') || op.equals('O'));
        this.sexo = op;
    }
    
    
}
