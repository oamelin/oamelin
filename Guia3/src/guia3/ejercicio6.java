/*
Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y determine
si ambos o alguno de ellos es mayor a 25.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nro1,nro2;
        System.out.print("Ingrese el 1° nro: ");
        nro1=leer.nextInt();
        System.out.print("Ingrese el 2° nro: ");
        nro2=leer.nextInt();
        if(nro1 > 25 || nro2 > 25 ){
            System.out.println("Alguno es mayor que 25 ");
        }else {
            System.out.println("ninguno es mayor que 25");
        }
            
    }
    
}
