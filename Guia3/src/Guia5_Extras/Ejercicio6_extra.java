/*
    SOPA DE LETRA EN TRABLERO DE 20X20
    INGRESAR 5 PALABRAS DE ENTRE 3 Y 5 
    CARACTERES DE LONGITUD
 */
package Guia5_Extras;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6_extra {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[][] sopa= new String[20][20];
        System.out.println("Ingresar 5 palabras de entre 3 y 5 caracteres");
        int cont=0;
        while (cont<5){
            int b=0;
            do
            {
                System.out.print("Ingrese palabr "+(cont+1)+": " );
                palabra=leer.nextLine();
                if(palabra.length()>2 && palabra.length()<6 ){
                    int fila=rand.nextInt(20);
                    int colum=rand.nextInt(20);
                    while ((colum+palabra.length())>20){
                        colum=rand.nextInt(20);
                    }
                    for(int j=colum;j<palabra.length()+colum;j++){
                        if(sopa[fila][j] != null){
                            b=1;
                            break;
                        }
                    }
                    if (b==0){
                        for(int j=colum;j<palabra.length()+colum;j++){
                            System.out.println(palabra.substring(j-colum,j-colum+1  )+" <- ");
                            sopa[fila][j]=palabra.substring(j-colum, j-colum+1);
                        }
                        cont++;b++;
                    }    
                }
            }
            while (b==0);
        }
        // relleno con numero 
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if ( sopa[i][j] == null ){
                    sopa[i][j]= String.valueOf(rand.nextInt(10));
                }
            }
        }
        System.out.println("///////  MATRIZ SOPA DE LETRAS ////////    ");
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
            
    }
    
}
