package Servicios;

import Entidades.Libro;
import persitencia.DAOLibro;

public class ServicioLibro {
    Libro libro = new Libro();
    private DAOLibro daolibro;

    public ServicioLibro() {
        daolibro = new DAOLibro();
    }
    public Libro crearLibro(){
        
    }
    
}
