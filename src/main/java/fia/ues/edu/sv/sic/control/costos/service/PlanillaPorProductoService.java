package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.PlanillaPorProducto;
import fia.ues.edu.sv.sic.control.costos.repository.PlanillaPorProductoRepo;

@Service
public class PlanillaPorProductoService extends AbstractService<PlanillaPorProducto, Long, PlanillaPorProductoRepo>{
    @Autowired
    private PlanillaPorProductoRepo repo;

    @Override
    protected PlanillaPorProductoRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(PlanillaPorProducto entity) {
        return entity.getIdPlanillaProducto();
    }
}
