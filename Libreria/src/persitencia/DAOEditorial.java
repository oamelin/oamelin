package persitencia;

import Entidades.Editorial;
import java.util.List;

public class DAOEditorial extends DAO <Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(String id) throws Exception {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }

    public Editorial  buscarPorId(String id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT * FROM Editorial ").getResultList();
        desconectar();
        return editorial;
    }

}
