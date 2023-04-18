/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 */
package Guia2_EjerciciosExtras;

import java.util.Scanner;

public class Ejericio3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String letra;
        System.out.println("Ingrese un caracter");
        letra=leer.next().toLowerCase();
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("Es una vocal ");
        }else{System.out.println("No es vocal");}
         
    }
    
}
