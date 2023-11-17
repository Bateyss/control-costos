package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.Rubro;
import fia.ues.edu.sv.sic.control.costos.repository.RubroRepo;

@Service
public class RubroService
        extends AbstractService<Rubro, Long, RubroRepo> {
    @Autowired
    private RubroRepo repo;

    @Override
    protected RubroRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(Rubro entity) {
        return entity.getIdRubro();
    }
}
