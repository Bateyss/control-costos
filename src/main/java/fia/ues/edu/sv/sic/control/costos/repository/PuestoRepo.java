package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import fia.ues.edu.sv.sic.control.costos.models.Puesto;

@RepositoryRestResource(collectionResourceRel = "inventariomp", path = "inventariomp")
public interface PuestoRepo extends PagingAndSortingRepository<Puesto, Long>, CrudRepository<Puesto, Long> {
    
}
