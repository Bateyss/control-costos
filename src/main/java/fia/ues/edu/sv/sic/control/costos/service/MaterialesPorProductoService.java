package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.MaterialesPorProducto;
import fia.ues.edu.sv.sic.control.costos.repository.MaterialesPorProductoRepo;

@Service
public class MaterialesPorProductoService extends AbstractService<MaterialesPorProducto, Long, MaterialesPorProductoRepo>{
    @Autowired
    private MaterialesPorProductoRepo repo;

    @Override
    protected MaterialesPorProductoRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(MaterialesPorProducto entity) {
        return entity.getIdMaterialProducto();
    }
}
