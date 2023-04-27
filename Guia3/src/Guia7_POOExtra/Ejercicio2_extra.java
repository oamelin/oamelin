/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
números y los ingresa en los atributos del objeto. Después, a través de otro 
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. 
*/
package Guia7_POOExtra;

import java.util.Scanner;

public class Ejercicio2_extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        Puntos distancia1= new Puntos();
        System.out.println("La distancia que hay entre los dos puntos es "+distancia1.distancia());

    }
 
   
}
