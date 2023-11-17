package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fia.ues.edu.sv.sic.control.costos.models.Planilla;

@Repository
public interface PlanillaRepo extends PagingAndSortingRepository<Planilla, Long>, CrudRepository<Planilla, Long> {
    
}
