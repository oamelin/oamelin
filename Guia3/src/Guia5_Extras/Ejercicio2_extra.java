/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
entre los elementos).
*/
package Guia5_Extras;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2_extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Ingrese tamaño del vector: ");
        int dim=leer.nextInt();
        System.out.print("Caga manual (s/n) ");
        int[] vec1=new int[dim],vec2 = new int[dim];
        if ((leer.next()).toUpperCase().equals("S")){
            for(int i=0;i<dim;i++){
                System.out.print("Vector1 elemento "+i+1+"= " );
                vec1[i]=leer.nextInt();
                System.out.print("Vector2 elemento "+i+1+"= " );
                vec2[i]=leer.nextInt();
            }
        }else{
            for(int i=0;i<dim;i++){
                vec1[i]=rand.nextInt(10);
                System.out.println("Vector1 elemento "+(i+1)+"= "+vec1[i] );
                vec2[i]=rand.nextInt(10);
                System.out.println("Vector2 elemento "+(i+1)+"= "+vec2[i] );
            }
        }
        System.out.println("VERIFICACION DE IGUALD DE VECTORES");
        for(int elemento:vec1){
            System.out.print(elemento+" ");
        }
        System.out.println(";");
        for(int elemento:vec2){
            System.out.print(elemento+" ");
        }
        System.out.println(";");
            
        for(int i=0;i<dim;i++)
            if (vec1[i]!=vec2[i]){
                System.out.println("Son Distintos");
                        break;
            }else{
                if ((i+1)==dim){
                    System.out.println("Los vectores son iguales");
                }
            }
    }
    
}
