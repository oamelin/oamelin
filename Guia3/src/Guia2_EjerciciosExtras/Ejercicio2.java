/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
 */
package Guia2_EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int A,B,C,D;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar valor a las variables:");
        System.out.print("A: ");
        A=leer.nextInt();
        System.out.print("B: ");
        B=leer.nextInt();
        System.out.print("C: ");
        C=leer.nextInt();
        System.out.print("D: ");
        D=leer.nextInt();
        System.out.println("Los valores ingresados son: ");
        System.out.println("A=>"+A+",B=>"+B+",C=>"+C+",D=>"+D);
        CAMBIO(A,B,C,D);
         int AUX;
        AUX=B;
        B=C;
        C=A;
        A=D; 
        D=AUX;
        System.out.println("A=>"+A+",B=>"+B+",C=>"+C+",D=>"+D);
    }

    public static void CAMBIO(int A , int B, int C, int D) {
        int AUX;
        AUX=B;
        B=C;
        C=A;
        A=D; 
        D=AUX;
        System.out.println("A=>"+A+",B=>"+B+",C=>"+C+",D=>"+D);
    }
    
}
