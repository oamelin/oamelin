/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.
*/
package Guia5_Extras;

import java.util.Scanner;

public class Ejercicio3_extra {

    public static void main(String[] args) {
        int[] vec;
        System.out.println("Se pasara a la Funcion carga ");
        vec=rellenar();
        System.out.println("Pasar el vector resultado a imprimir ");
        imprimir(vec);
        System.out.println(" FIN ");
    }

    public static int[] rellenar() {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int dim=leer.nextInt();
        int[] vec=new int[dim];
        for(int i=0;i<vec.length;i++){
            vec[i]=(int) (Math.random()*10);
        }
        for(int elem:vec){
            System.out.print(elem+" ");
        }
            System.out.println("");
            return vec;
    }

    private static void imprimir(int[] vec) {
        for(int elem:vec){
            System.out.print(elem+" ");
        }
            System.out.println("");
    }
    
}
