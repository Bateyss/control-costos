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
import fia.ues.edu.sv.sic.control.costos.models.InventarioMateriaPrima;
import fia.ues.edu.sv.sic.control.costos.repository.InventarioMateriaPrimaRepo;
import fia.ues.edu.sv.sic.control.costos.service.InventarioMateriaPrimaService;

@Controller
@RequestMapping("/inventariomp")
public class InventarioMateriaPrimaController
        extends AbstractController<InventarioMateriaPrima, Long, InventarioMateriaPrimaRepo, InventarioMateriaPrimaService> {
    @Autowired
    private InventarioMateriaPrimaService service;

    @Override
    protected InventarioMateriaPrimaService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        InventarioMateriaPrima inventarioMateriaPrima = new InventarioMateriaPrima();
        inventarioMateriaPrima.setIdInventarioMP(id);
        return super.obtenerEntidadPorId(inventarioMateriaPrima);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody InventarioMateriaPrima inventarioMateriaPrima) {
        return super.crearEntidad(inventarioMateriaPrima);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody InventarioMateriaPrima inventarioMateriaPrima) {
        return super.editarEntidad(inventarioMateriaPrima);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        InventarioMateriaPrima inventarioMateriaPrima = new InventarioMateriaPrima();
        inventarioMateriaPrima.setIdInventarioMP(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(inventarioMateriaPrima));
    }
}
