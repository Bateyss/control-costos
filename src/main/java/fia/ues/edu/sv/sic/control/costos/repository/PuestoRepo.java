package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fia.ues.edu.sv.sic.control.costos.models.Puesto;

@Repository
public interface PuestoRepo extends PagingAndSortingRepository<Puesto, Long>, CrudRepository<Puesto, Long> {
    
}
