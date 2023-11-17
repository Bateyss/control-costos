package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.Producto;
import fia.ues.edu.sv.sic.control.costos.repository.ProductoRepo;

@Service
public class ProductoService
        extends AbstractService<Producto, Long, ProductoRepo> {
    @Autowired
    private ProductoRepo repo;

    @Override
    protected ProductoRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(Producto entity) {
        return entity.getIdProducto();
    }
}
