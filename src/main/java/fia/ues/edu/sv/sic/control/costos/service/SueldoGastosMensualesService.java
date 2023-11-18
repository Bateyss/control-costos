package fia.ues.edu.sv.sic.control.costos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fia.ues.edu.sv.sic.control.costos.models.SueldoGastosMensuales;
import fia.ues.edu.sv.sic.control.costos.repository.SueldoGastosMensualesRepo;

@Service
public class SueldoGastosMensualesService  extends AbstractService<SueldoGastosMensuales, Long, SueldoGastosMensualesRepo>{
    @Autowired
    private SueldoGastosMensualesRepo repo;

    @Override
    protected SueldoGastosMensualesRepo getRepo() {
        return repo;
    }

    @Override
    protected Long getEntityId(SueldoGastosMensuales entity) {
        return entity.getIdSueldoGastoMensual();
    }
}
