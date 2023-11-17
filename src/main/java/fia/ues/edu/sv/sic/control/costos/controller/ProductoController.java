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
import fia.ues.edu.sv.sic.control.costos.models.Producto;
import fia.ues.edu.sv.sic.control.costos.repository.ProductoRepo;
import fia.ues.edu.sv.sic.control.costos.service.ProductoService;

@Controller
@RequestMapping("/proucto")
public class ProductoController
        extends AbstractController<Producto, Long, ProductoRepo, ProductoService> {
    @Autowired
    private ProductoService service;

    @Override
    protected ProductoService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        Producto producto = new Producto();
        producto.setIdProducto(id);
        return super.obtenerEntidadPorId(producto);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Producto producto) {
        return super.crearEntidad(producto);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Producto producto) {
        return super.editarEntidad(producto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        Producto producto = new Producto();
        producto.setIdProducto(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(producto));
    }
}
