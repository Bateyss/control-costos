package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.InventarioProductoVenta;
import fia.ues.edu.sv.sic.control.costos.repository.InventarioProductoVentaRepo;

@Service
public class InventarioProductoVentaService
        extends AbstractService<InventarioProductoVenta, Long, InventarioProductoVentaRepo> {
    @Autowired
    private InventarioProductoVentaRepo repo;

    @Override
    protected InventarioProductoVentaRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(InventarioProductoVenta entity) {
        return entity.getIdInventarioPPV();
    }
}
