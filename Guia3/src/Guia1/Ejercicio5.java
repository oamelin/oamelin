package Guia1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero=leer.nextInt();
        System.out.println("Doble =>"+(numero * 2));
        System.out.println("Triple =>"+(numero * 3));
        System.out.println("Raiz cuadrada =>"+(Math.sqrt(numero) ));
    }
    
}
