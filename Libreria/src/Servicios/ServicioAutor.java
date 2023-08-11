package Servicios;

import Entidades.Autor;
import static java.lang.Boolean.TRUE;
import java.util.List;
import java.util.Scanner;
import persitencia.DAOAutor;

public class ServicioAutor {
    private DAOAutor daoautor;
    private Autor autor;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ServicioAutor() {
        this.daoautor = new DAOAutor();
    }
    
    // este método invoca el método guardar de la clase DAO padre para 
    // persistir un objeto Autor
    public Autor crearAutor() {
        Autor autor = new Autor();
        try {
            System.out.print("Ingresar el Nombre completo del Autor: ");
            autor.setNombre(leer.nextLine());
            autor.setAlta(TRUE);
            daoautor.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorId() {
        try {
            System.out.print("Ingresar el Codigo del Autor: ");
            return daoautor.buscarPorId(leer.nextInt());
        } catch (Exception e) {
            System.out.println("No se encontro el ID");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminar(Integer id) {
        try {
            daoautor.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Autor> listarAutors() {
        try {
            return daoautor.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }    
}   
