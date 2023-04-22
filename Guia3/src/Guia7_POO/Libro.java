/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas
 */
package Guia7_POO;

import java.util.Scanner;

public class Libro {
    String ISBN;
    String Titulo;
    String Autor;
    int numPag;

    public Libro(String ISBN, String Titulo, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPag = numPag;
    }
    public Libro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ISBN: ");
        this.ISBN = leer.nextLine();
        System.out.println("Titulo: ");
        this.Titulo = leer.nextLine();
        System.out.println("Autor: ");
        this.Autor = leer.nextLine();
        System.out.println("Nro de paginas: ");
        this.numPag = leer.nextInt();
    
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getNumPag() {
        return numPag;
    }
    
    
    
}
