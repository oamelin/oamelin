/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package Guia2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nro, limite,suma = 0;
        System.out.print("Ingrese el numero limite: ");
        limite=leer.nextInt();
        while (suma < limite){
            System.out.print("Ingrese un numero a sumar: ");
            suma=suma+leer.nextInt();
        }
        System.out.println("La suma es "+suma+" y el limite fue de "+limite);
    }
    
}
