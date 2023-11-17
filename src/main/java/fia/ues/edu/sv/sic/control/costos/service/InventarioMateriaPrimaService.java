package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.InventarioMateriaPrima;
import fia.ues.edu.sv.sic.control.costos.repository.InventarioMateriaPrimaRepo;

@Service
public class InventarioMateriaPrimaService
        extends AbstractService<InventarioMateriaPrima, Long, InventarioMateriaPrimaRepo> {
    @Autowired
    private InventarioMateriaPrimaRepo repo;

    @Override
    protected InventarioMateriaPrimaRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(InventarioMateriaPrima entity) {
        return entity.getIdInventarioMP();
    }
}
