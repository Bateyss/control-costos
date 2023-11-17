package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.Planilla;
import fia.ues.edu.sv.sic.control.costos.repository.PlanillaRepo;

@Service
public class PlanillaService
        extends AbstractService<Planilla, Long, PlanillaRepo> {
    @Autowired
    private PlanillaRepo repo;

    @Override
    protected PlanillaRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(Planilla entity) {
        return entity.getIdPlanilla();
    }
}
