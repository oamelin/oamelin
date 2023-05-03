/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.

Método para crearCircunferencia(): que le pide el radio y lo guarda  
en el atributo del objeto.

Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Guia7_POO;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Circunferencia {
    Scanner leer=new Scanner(System.in);
    private float radio;

    public void Circunferencia() {
        crearCircunferencia();
    }
    
    public void crearCircunferencia() {
        System.out.print("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextInt();
    }
    
    public double area(){
        return Math.pow(PI*radio,2); 
    }
    
    public double Perimetro(){
    return 2*PI*radio;
    }
}