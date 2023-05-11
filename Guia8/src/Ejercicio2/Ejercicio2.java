package Ejercicio2;



import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera cf = new Cafetera();
        CafeteraServicio scf = new CafeteraServicio();    
        System.out.println("Capacidad Maxima= "+cf.getCapacidadMáxima()+" "
                           +"Capacidad Actual= "+cf.getCantidadActual());

        System.out.println("llenar la Cafetera");
        scf.llenarCafetera(cf);
        System.out.println("Capacidad Maxima= "+cf.getCapacidadMáxima()+" "
                           +"Capacidad Actual= "+cf.getCantidadActual());
        System.out.println("Servir cafe ");
        System.out.println("Estado de la cafetera:"+cf.getCantidadActual());
        System.out.print("Capacidad de la taza");
        scf.servirTaza(leer.nextInt(),cf);
        System.out.println("Estado de la cafetera:"+cf.getCantidadActual());
        scf.servirTaza(leer.nextInt(),cf);
        System.out.println("Estado de la cafetera:"+cf.getCantidadActual());
        
    }
    
}


 