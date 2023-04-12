/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op; 
        System.out.println("******   MENU   ******");
        System.out.println("* 1 ejercicio 6      *");
        System.out.println("**********************");
        op=leer.nextInt();
        switch(op)
        {
            case 1:
                ejemplo6;
                break;
                
        }
        System.out.println("");
    }
    
}
