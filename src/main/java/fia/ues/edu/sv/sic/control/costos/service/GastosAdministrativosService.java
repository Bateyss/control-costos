package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.GastosAdministrativos;
import fia.ues.edu.sv.sic.control.costos.repository.GastosAdministrativosRepo;

@Service
public class GastosAdministrativosService extends AbstractService<GastosAdministrativos, Long, GastosAdministrativosRepo>{
     @Autowired
    private GastosAdministrativosRepo repo;

    @Override
    protected GastosAdministrativosRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(GastosAdministrativos entity) {
        return entity.getIdGastoAdministrativo();
    }
}
