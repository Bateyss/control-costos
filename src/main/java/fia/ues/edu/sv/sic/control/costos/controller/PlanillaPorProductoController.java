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
import fia.ues.edu.sv.sic.control.costos.models.PlanillaPorProducto;
import fia.ues.edu.sv.sic.control.costos.repository.PlanillaPorProductoRepo;
import fia.ues.edu.sv.sic.control.costos.service.PlanillaPorProductoService;

@Controller
@RequestMapping("/planillasporproducto")
public class PlanillaPorProductoController extends AbstractController<PlanillaPorProducto, Long, PlanillaPorProductoRepo, PlanillaPorProductoService>{
    @Autowired
    private PlanillaPorProductoService service;

    @Override
    protected PlanillaPorProductoService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        PlanillaPorProducto departamento = new PlanillaPorProducto();
        departamento.setIdPlanillaProducto(id);
        return super.obtenerEntidadPorId(departamento);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody PlanillaPorProducto departamento) {
        return super.crearEntidad(departamento);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody PlanillaPorProducto departamento) {
        return super.editarEntidad(departamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        PlanillaPorProducto departamento = new PlanillaPorProducto();
        departamento.setIdPlanillaProducto(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(departamento));
    }
}
