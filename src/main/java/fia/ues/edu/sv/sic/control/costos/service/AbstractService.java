package fia.ues.edu.sv.sic.control.costos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public abstract class AbstractService<ENTITY, ID, REPO extends CrudRepository<ENTITY, ID>> {
    protected abstract REPO getRepo();

    protected abstract ID getEntityId(ENTITY entity);

    public ENTITY crearEntidad(ENTITY entity) {
        return getRepo().save(entity);
    }

    public ENTITY editarEntidad(ENTITY entity) {
        return getRepo().save(entity);
    }

    public void eliminarEntidad(ENTITY entity) {
        getRepo().deleteById(getEntityId(entity));
    }

    public ENTITY buscarEntidadPorId(ENTITY entity) {
        return getRepo().findById(getEntityId(entity)).orElse(null);
    }

    public List<ENTITY> obtenerListaEntidad() {
        List<ENTITY> lista = new ArrayList<>();
        getRepo().findAll().forEach(lista::add);
        return lista;
    }
}
