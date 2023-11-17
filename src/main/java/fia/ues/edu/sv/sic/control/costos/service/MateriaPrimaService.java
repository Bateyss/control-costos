package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.MateriaPrima;
import fia.ues.edu.sv.sic.control.costos.repository.MateriaPrimaRepo;

@Service
public class MateriaPrimaService
        extends AbstractService<MateriaPrima, Long, MateriaPrimaRepo> {
    @Autowired
    private MateriaPrimaRepo repo;

    @Override
    protected MateriaPrimaRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(MateriaPrima entity) {
        return entity.getIdMateria();
    }
}
