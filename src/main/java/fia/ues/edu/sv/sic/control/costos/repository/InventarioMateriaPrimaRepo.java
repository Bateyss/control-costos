package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import fia.ues.edu.sv.sic.control.costos.models.InventarioMateriaPrima;

@RepositoryRestResource(collectionResourceRel = "inventariomp", path = "inventariomp")
public interface InventarioMateriaPrimaRepo extends PagingAndSortingRepository<InventarioMateriaPrima, Long>, CrudRepository<InventarioMateriaPrima, Long> {
    
}
