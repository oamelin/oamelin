/*
Crear una clase llamada Operacion que tenga como atributos 
privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
suma reste multiplicacion division
*/
package Guia7_POO;

import java.util.Scanner;

public class Ejercicio3_poo {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op=0;
        Operacion op1=new Operacion();
        do
        {
        op1.crearOperacion();
        System.out.println("//////// MENU DE OPERACIONES ///////");
        System.out.println(" 1 - suma ");
        System.out.println(" 2 - rest ");
        System.out.println(" 3 - multiplicacion ");
        System.out.println(" 4 - division ");
        System.out.println(" 5 - Salir ");
        System.out.print(" OPCION: ");
        op = leer.nextInt();
        switch ( op ) {
            case 1:
                System.out.println("La suma es: "+op1.suma());
           break;
           case 2:
                System.out.println("La resta es: "+op1.restar());
                break;
           case 3:
                System.out.println("La multiplicacion es: "+op1.multiplicar());
                break;
           case 4:
                System.out.println("La division es: "+op1.dividir());
                break;
           case 5:
                System.out.println("NO VEMOS ");
                break;
           default:
           System.out.println("error del 1 - 5 " );
           break;
        }
        }while (op !=5);
        
    }
}
