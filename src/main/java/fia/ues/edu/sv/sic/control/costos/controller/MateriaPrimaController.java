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
import fia.ues.edu.sv.sic.control.costos.models.MateriaPrima;
import fia.ues.edu.sv.sic.control.costos.repository.MateriaPrimaRepo;
import fia.ues.edu.sv.sic.control.costos.service.MateriaPrimaService;

@Controller
@RequestMapping("/materiaprima")
public class MateriaPrimaController
        extends AbstractController<MateriaPrima, Long, MateriaPrimaRepo, MateriaPrimaService> {
    @Autowired
    private MateriaPrimaService service;

    @Override
    protected MateriaPrimaService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setIdMateria(id);
        return super.obtenerEntidadPorId(materiaPrima);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody MateriaPrima materiaPrima) {
        return super.crearEntidad(materiaPrima);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody MateriaPrima materiaPrima) {
        return super.editarEntidad(materiaPrima);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setIdMateria(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(materiaPrima));
    }
}
