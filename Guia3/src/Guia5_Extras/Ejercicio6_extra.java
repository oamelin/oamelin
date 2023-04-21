/*
    SOPA DE LETRA EN TRABLERO DE 20X20
    INGRESAR 5 PALABRAS DE ENTRE 3 Y 5 
    CARACTERES DE LONGITUD
 */
package Guia5_Extras;

import java.util.Scanner;

public class Ejercicio6_extra {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[][] sopa= new String[20][20];
        System.out.println("Ingresar 5 palabras de entre 3 y 5 caracteres");
        int cont=0;
        while (cont<5){
            System.out.print("Ingrese palabr "+(cont+1)+": " );
            palabra=leer.nextLine();
            int b=0;
            do
            {
                if(palabra.length()>2 && palabra.length()<6 ){
                    int fila=(int) (Math.random()*20);
                    int columna=(int) (Math.random()*20);
                    for(int j=columna;j<palabra.length();j++){
                        if(!sopa[fila][j].equals("")){
                            b=1;
                            break;
                        }
                    }
                    if (b==0){
                        for(int j=columna;j<palabra.length();j++){
                            sopa[fila][j]=palabra.substring(j-columna, j-columna);
                        cont++;
                        }
                    }    
                }
            }
            while (b==0);
        }
        // relleno con numero 
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if (sopa[i][j].equals("")){
                    int num=(int)(Math.random()*10);
                    sopa[i][j]= String.valueOf(Math.random()*10);
                }
            }
        }
        System.out.println("///////////  MATRIZ SOPA DE LETRAS ////////    ");
        for(String[] letra:sopa){
            System.out.println(letra+" ");
        }
            
    }
    
}
