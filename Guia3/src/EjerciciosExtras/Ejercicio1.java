/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su 
equivalente: 1 día, 2 horas.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;
        System.out.print("Ingrese la cantidad de minutos: ");
        minutos=leer.nextInt();
        int horas = ((minutos/60)% 60) ;
        System.out.println("dias "+((minutos % 60) / 24));
        System.out.println("horas"+horas );
        System.out.println("horas"+(horas % 24) );
        System.out.println("minutos"+((minutos % 60) ));
        System.out.println("");
        System.out.println(""+Math.abs(minutos));
    }
    
}
