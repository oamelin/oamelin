package Guia10_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SerPelicula {
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void cargaPelicula(ArrayList p ){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String título;
        String director;
        double duracion;
        do{
            System.out.println("---- Ralizar carga de pelicula ----");
            System.out.print("Titulo: ");
            título =leer.next();
            System.out.print("Director; ");
            director = leer.next();
            System.out.print("Duracion; ");
            duracion=leer.nextDouble();
            p.add(new Pelicula(título,director,duracion));
            System.out.println("Continuar la carga ");
            if( leer.next().equalsIgnoreCase("n") ){
                break;}
        }while (true);
    }
    public void mostrarPeliculas(){
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }
}

/*
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.


*/