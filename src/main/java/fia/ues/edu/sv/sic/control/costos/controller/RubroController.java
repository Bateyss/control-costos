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
import fia.ues.edu.sv.sic.control.costos.models.Rubro;
import fia.ues.edu.sv.sic.control.costos.repository.RubroRepo;
import fia.ues.edu.sv.sic.control.costos.service.RubroService;

@Controller
@RequestMapping("/rubro")
public class RubroController
        extends AbstractController<Rubro, Long, RubroRepo, RubroService> {
    @Autowired
    private RubroService service;

    @Override
    protected RubroService getService() {
        return service;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> obtenerLista() {
        return super.obtenerListaEntidad();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable(name = "id") Long id) {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(id);
        return super.obtenerEntidadPorId(rubro);
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Rubro rubro) {
        return super.crearEntidad(rubro);
    }

    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Rubro rubro) {
        return super.editarEntidad(rubro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(name = "id") Long id) {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(id);
        return super.eliminarEntidad(service.buscarEntidadPorId(rubro));
    }
}
