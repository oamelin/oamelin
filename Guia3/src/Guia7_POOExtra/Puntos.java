/*

*/


package Guia7_POOExtra;

import java.util.Scanner;

public class Puntos {
    private int x,x1,y,y1;
    Scanner leer = new Scanner(System.in);

    public Puntos() {
        crearPuntos();
    }

    
    public void crearPuntos() {
        System.out.println("Ingresar las cordenadas de los dos puntos a calcularsu distancia ");
        System.out.println("Valor x1: ");
        this.x=leer.nextInt();
        System.out.println("Valor x2: ");
        this.x1=leer.nextInt();
        System.out.println("Valor y1: ");
        this.y=leer.nextInt();
        System.out.println("Valor y2: ");
        this.y1=leer.nextInt();
     
    }
    
    public double distancia(){
        return Math.sqrt(Math.pow((this.x1-this.x),2)+Math.pow((this.y1-this.y),2)) ;
    }
    
            
}
  