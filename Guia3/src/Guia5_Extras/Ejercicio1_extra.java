/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.*/
package Guia5_Extras;

import java.util.Scanner;

public class Ejercicio1_extra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int result=0;
        int[] vec;
        System.out.print("ingrese el tamaño del vector= ");
        int dim=leer.nextInt();
        System.out.println("Ingrese los numero para el vector de "+dim+" elementos");
        vec=new int[dim];
        for(int i=0;i<dim;i++){
            vec[i]=leer.nextInt();            
        }
        System.out.print("Vector => ");
        for(int elemento:vec){
            result+=elemento;
            System.out.print(elemento+" ");
        }
        System.out.println(". ");
        System.out.println("La suma de los elementos del vextor es: "+result);
    }
    
}
