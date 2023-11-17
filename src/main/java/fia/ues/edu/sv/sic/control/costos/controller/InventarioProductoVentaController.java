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
import fia.ues.edu.sv.sic.control.costos.models.InventarioProductoVenta;
import fia.ues.edu.sv.sic.control.costos.repository.InventarioProductoVentaRepo;
import fia.ues.edu.sv.sic.control.costos.service.InventarioProductoVentaService;

@Controller
@RequestMapping("/inventarioppv")
public class InventarioProductoVentaController
        extends AbstractController<InventarioProductoVenta, Long, InventarioProductoVentaRepo, InventarioProductoVentaService> {
    @Autowired
    private InventarioProductoVentaService service;

    @Override
    protected InventarioProductoVentaService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        InventarioProductoVenta inventarioProductoVenta = new InventarioProductoVenta();
        inventarioProductoVenta.setIdInventarioPPV(id);
        return super.obtenerEntidadPorId(inventarioProductoVenta);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody InventarioProductoVenta inventarioProductoVenta) {
        return super.crearEntidad(inventarioProductoVenta);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody InventarioProductoVenta inventarioProductoVenta) {
        return super.editarEntidad(inventarioProductoVenta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        InventarioProductoVenta inventarioProductoVenta = new InventarioProductoVenta();
        inventarioProductoVenta.setIdInventarioPPV(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(inventarioProductoVenta));
    }
}
