package Guia2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j;
        System.out.print("ingrese i: ");
        i=leer.nextInt();
        System.out.print("Ingrese j: ");
        j=leer.nextInt();
        /*
        Para i=1 Hasta nro Con Paso 1 Hacer
		Para j=1 Hasta nro Con Paso 1 Hacer
			si i==1 o i== nro Entonces
				Escribir "*" Sin Saltar
			SiNo
				si j==1 o j == nro Entonces
					Escribir "*" Sin Saltar
				SiNo
					Escribir " " Sin Saltar
				FinSi
			FinSi
		Fin Para
        */
        for (int ii = 1; ii <= i; ii++) {
            for (int jj = 1; jj <= j; jj++) {
                if (ii==1 || ii==i){
                    System.out.print("i");
                    }else{
                        if (jj==1 || jj==j){
                            System.out.print("j");
                        }else{
                            System.out.print(" ");}
                    }
            }
            System.out.println("");
    	}System.out.println("");
    	
    }
    
}
