package persitencia;

import Entidades.Autor;
import java.util.List;

public class DAOAutor extends DAO <Autor> {
        
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor  buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autor = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autor;
    }

}
