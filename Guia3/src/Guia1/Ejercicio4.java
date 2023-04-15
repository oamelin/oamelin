package Guia1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Centigrado: ");
        float temperatura=leer.nextFloat();
        System.out.println("Equivalente en grados Fahrenheit= "+(32+(9*temperatura/5)));
    }
    
}
