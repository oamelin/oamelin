/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el 
programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de 
confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
se vuelve a mostrar el menú.
 */
package EjercPracticos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op = "N";
        int nro1,nro2;
        do{
            System.out.print("Ingrese Numero 1: ");
            nro1=leer.nextInt();
            System.out.print("Ingrese Numero 2: ");
            nro2=leer.nextInt();
            
            System.out.println("*** MENU ***");
            System.out.println("1 SUMAR");
            System.out.println("2 RESTAR");
            System.out.println("3 MULTIPLICAR");
            System.out.println("4 DIVIDIR");
            System.out.println("5 SALIR");
            System.out.println("Ingrese una opcion: ");
            op=leer.next();
            switch(op) {
                case "1":
                        System.out.println("La suma es "+(nro1+nro2));
                        break;
                case "2":
                        System.out.println("La resta es "+(nro1-nro2));
                        break;
                case "3":
                        System.out.println("La multiplicacion es "+(nro1*nro2));
                        break;
                case "4":
                        while (nro2== 0){
                            System.out.println("ingrese un numero distinto a 0");
                            nro2=leer.nextInt();
                        }
                        System.out.println("La division es "+(nro1/nro2));
                        break;
                case "5":
                        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                        op=leer.next();
                        break;
                default:
                        System.out.println("Ingrese un valor del 1-5 ");
            }

            System.out.println("opcion"+op);
        }while (!op.equals("S"));
        System.out.println("Hasta luego!");
    }
    
}
