/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package Guia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=leer.nextLine();
        System.out.println("Substring => "+frase.substring(0, 1) );
        System.out.println("longitud => "+frase.substring(0, 1).length());
        System.out.println("Condicion => "+frase.substring(0, 1).equals("A"));
        if (frase.substring(0, 1).equals("A")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
