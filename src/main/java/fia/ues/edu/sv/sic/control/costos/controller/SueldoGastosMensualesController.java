package fia.ues.edu.sv.sic.control.costos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fia.ues.edu.sv.sic.control.costos.controller.abs.AbstractController;
import fia.ues.edu.sv.sic.control.costos.models.SueldoGastosMensuales;
import fia.ues.edu.sv.sic.control.costos.repository.SueldoGastosMensualesRepo;
import fia.ues.edu.sv.sic.control.costos.service.SueldoGastosMensualesService;

@Controller
@RequestMapping("/sueldosgastosmensuales")
public class SueldoGastosMensualesController extends AbstractController<SueldoGastosMensuales, Long, SueldoGastosMensualesRepo, SueldoGastosMensualesService>{
    @Autowired
    private SueldoGastosMensualesService service;

    @Override
    protected SueldoGastosMensualesService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        SueldoGastosMensuales departamento = new SueldoGastosMensuales();
        departamento.setIdSueldoGastoMensual(id);
        return super.obtenerEntidadPorId(departamento);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody SueldoGastosMensuales departamento) {
        return super.crearEntidad(departamento);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody SueldoGastosMensuales departamento) {
        return super.editarEntidad(departamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        SueldoGastosMensuales departamento = new SueldoGastosMensuales();
        departamento.setIdSueldoGastoMensual(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(departamento));
    }
}
