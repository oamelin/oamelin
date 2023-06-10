package Guia10_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SerPelicula {
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void cargaPelicula( ){
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
            Pelicula p;
            p = new Pelicula(título,director,duracion);
            peliculas.add(p);
            System.out.println("Continuar la carga ");
            if( leer.next().equalsIgnoreCase("n") ){
                break;}
        }while (true);
    }
    public void mostrarPeliculas(){
        for (Iterator<Pelicula> it = peliculas.iterator(); it.hasNext();) {
            Pelicula p = it.next();
            System.out.println(p.toString());
        }
    }

    void pelisxtiempo() {
        System.out.println("Peliculas que superan la hora de reproducción ");
        for (Pelicula p : peliculas){
            
        }
    }
}

/*

• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.


*/