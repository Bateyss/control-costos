package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fia.ues.edu.sv.sic.control.costos.models.Departamento;

@Repository
public interface DepartamentoRepo
        extends PagingAndSortingRepository<Departamento, Long>, CrudRepository<Departamento, Long> {
    
}
