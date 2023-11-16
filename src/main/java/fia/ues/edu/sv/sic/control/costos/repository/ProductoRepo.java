package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import fia.ues.edu.sv.sic.control.costos.models.Producto;

@RepositoryRestResource(collectionResourceRel = "inventariomp", path = "inventariomp")
public interface ProductoRepo extends PagingAndSortingRepository<Producto, Long>, CrudRepository<Producto, Long> {
    
}