/*
        Fibonacci
 */
package Guia5_Extras;

import java.util.Scanner;

public class Ejercicio7_extra {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el numero para calcular la secuancia de Fibonacci: ");
        int nro=leer.nextInt();
        int result=fibo(nro);
        System.out.println("La seriees "+result);
        
    }

    public static int fibo(int n){
       int numeros;

       for(int i = 2; i < n; i++)
       {
          numeros = fibo(i - 1)+ fibo(i - 2);
       }

       return numeros;
    }
    
}
