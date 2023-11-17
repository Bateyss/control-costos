package fia.ues.edu.sv.sic.control.costos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PLANILLA_PRODUCTO")
public class PlanillaPorProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANILLA_PRODUCTO")
    private Long idPlanillaProducto;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
    @ManyToOne
    private Producto producto;
    @JoinColumn(name = "ID_PLANILLA", referencedColumnName = "ID_PLANILLA")
    @ManyToOne
    private Planilla planilla;
    @Column(name = "CANTIDAD_RECURSOS")
    private Double cantidadRecursos;
    @Column(name = "HORAS_LABORADAS")
    private Double horasLaboradas;
    @Column(name = "HORAS_NOCTURNIDAD")
    private Double horasNocturnidad;
    @Column(name = "HORAS_EXTRA_DIURNAS")
    private Double horasExtraDiurnas;
    @Column(name = "HORAS_EXTRA_NOCTURNAS")
    private Double horasExtraNocturnas;
}
