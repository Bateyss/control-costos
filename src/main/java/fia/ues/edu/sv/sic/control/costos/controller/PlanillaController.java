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
import fia.ues.edu.sv.sic.control.costos.models.Planilla;
import fia.ues.edu.sv.sic.control.costos.repository.PlanillaRepo;
import fia.ues.edu.sv.sic.control.costos.service.PlanillaService;

@Controller
@RequestMapping("/planilla")
public class PlanillaController
        extends AbstractController<Planilla, Long, PlanillaRepo, PlanillaService> {
    @Autowired
    private PlanillaService service;

    @Override
    protected PlanillaService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        Planilla planilla = new Planilla();
        planilla.setIdPlanilla(id);
        return super.obtenerEntidadPorId(planilla);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Planilla planilla) {
        return super.crearEntidad(planilla);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Planilla planilla) {
        return super.editarEntidad(planilla);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        Planilla planilla = new Planilla();
        planilla.setIdPlanilla(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(planilla));
    }
}
