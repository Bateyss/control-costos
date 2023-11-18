package fia.ues.edu.sv.sic.control.costos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fia.ues.edu.sv.sic.control.costos.models.GastosAdministrativos;

@Repository
public interface GastosAdministrativosRepo extends PagingAndSortingRepository<GastosAdministrativos, Long>, CrudRepository<GastosAdministrativos, Long> {
    
}
