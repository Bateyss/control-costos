package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.Departamento;
import fia.ues.edu.sv.sic.control.costos.repository.DepartamentoRepo;

@Service
public class DepartamentoService extends AbstractService<Departamento, Long, DepartamentoRepo> {
    @Autowired
    private DepartamentoRepo repo;

    @Override
    protected DepartamentoRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(Departamento entity) {
        return entity.getIdDepartamento();
    }
}
