/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
autor de la canción. Se deberán además definir los métodos getters y setters 
correspondientes.
*/

package Guia7_POOExtra;

import java.util.Scanner;

public class Ejercicio1_extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String titulo,autor;
        
        System.out.println("Ingesar el título y el autor de la canción. ");
        System.out.print("Autor: ");
        autor=leer.nextLine();
        System.out.print("Titulo: ");
        titulo=leer.nextLine();
        Cancion tema= new Cancion(titulo, autor);
        System.out.println("El titulo ingresado es "+tema.getTitulo()+" y su autor "+tema.getAutor());
        System.out.println("Se creara un objeto tema con un constructor VACIO");
        Cancion temaVacio = new Cancion();
        System.out.println("Objeto VACIO titulo ingresado es "+temaVacio.getTitulo()+" y su autor "+temaVacio.getAutor());

    }
    
}
