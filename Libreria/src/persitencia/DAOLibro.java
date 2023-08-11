package persitencia;

import Entidades.Libro;
import java.util.List;

public class DAOLibro extends DAO <Libro>{
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(String id) throws Exception {
        Libro libro = buscarPorId(id);
        super.eliminar(libro);
    }

    public Libro  buscarPorId(String id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libro = em.createQuery("SELECT * FROM Libro ").getResultList();
        desconectar();
        return libro;
    }

}
