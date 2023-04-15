/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
*/

package Guia1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a sumar:");
        System.out.print("Numero1:");
        int nro1=leer.nextInt();
        System.out.print("Numero2:");
        int nro2=leer.nextInt();
        System.out.println("Suma : "+nro1+"+"+nro2+"= "+(nro1+nro2));
        
        
    }
    
}
