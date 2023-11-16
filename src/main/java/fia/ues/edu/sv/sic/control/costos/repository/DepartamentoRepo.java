package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import fia.ues.edu.sv.sic.control.costos.models.Departamento;

@RepositoryRestResource(collectionResourceRel = "departamento", path = "departamento")
public interface DepartamentoRepo extends PagingAndSortingRepository<Departamento, Long>, CrudRepository<Departamento, Long> {
    
}
