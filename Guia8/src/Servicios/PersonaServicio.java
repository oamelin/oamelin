/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p= new Persona();
    
public void crearPersona(Persona p) {
    System.out.println("Ingresar Datos de la Persona");
    System.out.print("Nombre: ");
    p.setNombre(leer.nextLine());
    System.out.print("Edad; ");
    p.setEdad(leer.nextInt());
    System.out.print("Peso: ");
    p.setPeso(leer.nextDouble());
    System.out.print("Altura: ");
    p.setAltura(leer.nextDouble());
    String op;
        do
        {
            System.out.print("Ingrese sexo (H-M-O): ");
            op=leer.next().toUpperCase();
        }while (!(op.equals("H") || op.equals("M") || op.equals("O")));
        leer.nextLine();
        p.setSexo(op);
//    return p;
} 
    public boolean esMayorDeEdad(Persona p){
        if (p.getEdad() > 18){
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("No es mayor de Edad");}
        return p.getEdad() > 18;
    } 
    
    public int calcularIMC(Persona p){
        double result= p.getPeso()/(p.getAltura()*p.getAltura());
        if (result > 25){
            System.out.println("Sobrepeso");
            return 1;
        }else{
            if (result > 20 ){
                System.out.println("Peso ideal");
                return 0;
            }else{
                System.out.println("por debajo de su peso ideal");
                return -1;
            }
        }
    }
}
