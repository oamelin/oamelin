/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

 */
package EjercPracticos;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una palabra: ");
        frase = leer.nextLine();
        
        if (frase.equals("eureka")){
                System.out.println("La palabra "+frase+" es iguala eureka");
    }else{
                System.out.println("La palabra ingresada fue "+frase);
    
    }
        System.out.println("******************************");
        if ( "eureka".equals(frase) ){
                System.out.println("La palabra "+frase+" es iguala eureka");
    }else{
                System.out.println("La palabra ingresada fue "+frase);
    
    
    }
}
}