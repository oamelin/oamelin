/*
 Crear una las llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas
*/
package Guia7_POO;

import java.util.Scanner;

public class Ejercicio1_poo {

    public static void main(String[] args) {
        Libro libro=null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargara un libro");
        System.out.println("1 - Constructor con parametro");
        System.out.println("2 - Constructor sin parametros");;
        System.out.print("OPCION: ");
        switch(leer.nextInt()){
            case 1:
                System.out.print("ISBN: ");
                leer.nextLine();
                String ISBN = leer.nextLine();
                System.out.print("Titulo: ");
                String Titulo = leer.nextLine();
                System.out.print("Autor: ");
                String Autor = leer.nextLine();
                System.out.print("Nro de paginas: ");
                int numPag = leer.nextInt();
    
                 libro= new Libro(ISBN, Titulo, Autor, numPag);
                break;
            case 2:
                 libro=new Libro();
                break;
            default:
                System.out.println("Ingres 1 o 2");
                break;
        }
        System.out.println("ISBN "+libro.ISBN+
                " Titulo: "+libro.Titulo
        +" Autor: "+libro.Autor+" Nro de Pagiomas:"+libro.numPag);
        
    }
      
}
    

