/*
Crear un programa que dado un número determine si es par o impar.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nro;
        System.out.print("Ingrese un numero: ");
        nro= leer.nextInt();
        if (nro % 2 == 0 ){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado no es par");  
        }
    
    }
}
