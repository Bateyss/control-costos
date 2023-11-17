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
import fia.ues.edu.sv.sic.control.costos.models.Puesto;
import fia.ues.edu.sv.sic.control.costos.repository.PuestoRepo;
import fia.ues.edu.sv.sic.control.costos.service.PuestoService;

@Controller
@RequestMapping("/puesto")
public class PuestoController
        extends AbstractController<Puesto, Long, PuestoRepo, PuestoService> {
    @Autowired
    private PuestoService service;

    @Override
    protected PuestoService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        Puesto puesto = new Puesto();
        puesto.setIdPuesto(id);
        return super.obtenerEntidadPorId(puesto);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Puesto puesto) {
        return super.crearEntidad(puesto);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Puesto puesto) {
        return super.editarEntidad(puesto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        Puesto puesto = new Puesto();
        puesto.setIdPuesto(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(puesto));
    }
}
