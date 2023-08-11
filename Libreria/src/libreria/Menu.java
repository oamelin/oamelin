package libreria;

import Servicios.ServicioAutor;
import java.util.Scanner;

public class Menu {
    Scanner op = new Scanner(System.in).useDelimiter("\n");
    ServicioAutor sa= new ServicioAutor();
    public Menu() {
    }
    public void MenuADMIN (){
        System.out.println("*** MENU ABM DE LIBRERIA ***");
        System.out.println("1.- Alta de Autor");
        System.out.println("2.- Búsqueda de un libro por ISBN");
        System.out.println("3.- Búsqueda de un libro por Título");
        System.out.println("4.- Búsqueda de un libro/s por nombre de Autor");
        System.out.println("5.- Búsqueda de un libro/s por nombre de Editorial");
        System.out.print("Opcion: ");
        switch (op.nextInt()) {
            case 1:
                sa.crearAutor();
                break;
            default:
                throw new AssertionError();
        }
    }
    public void MenuUser (){
        System.out.println("*** MENU DE LIBRERIA ***");
        System.out.println("1.- Búsqueda de un Autor por nombre");
        System.out.println("2.- Búsqueda de un libro por ISBN");
        System.out.println("3.- Búsqueda de un libro por Título");
        System.out.println("4.- Búsqueda de un libro/s por nombre de Autor");
        System.out.println("5.- Búsqueda de un libro/s por nombre de Editorial");
        System.out.print("Opcion: ");
        switch (op.nextInt()) {
            case 1:
                sa.buscarPorId();
                break;
            case 2:
                sa.buscarPorId();
                break;
            default:
                throw new AssertionError();
        }
    }
}