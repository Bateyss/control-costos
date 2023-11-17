package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.Puesto;
import fia.ues.edu.sv.sic.control.costos.repository.PuestoRepo;

@Service
public class PuestoService
        extends AbstractService<Puesto, Long, PuestoRepo> {
    @Autowired
    private PuestoRepo repo;

    @Override
    protected PuestoRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(Puesto entity) {
        return entity.getIdPuesto();
    }
}
