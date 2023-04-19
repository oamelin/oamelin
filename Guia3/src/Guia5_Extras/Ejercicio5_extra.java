/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio5_extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();        
        int fila, columna;
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        fila=leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz ");
        columna=leer.nextInt();
        int[][] mat = new int[fila][columna];
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                mat[i][j]= rand.nextInt(10);
            }
        }
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
