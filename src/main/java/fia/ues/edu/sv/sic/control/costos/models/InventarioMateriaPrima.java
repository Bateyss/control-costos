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
@Table(name = "INVENTARIO_MATERIA_PRIMA")
public class InventarioMateriaPrima {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INVENTARIO_MP")
    private Long idInventarioMP;

    @JoinColumn(name = "ID_MATERIA", referencedColumnName = "ID_MATERIA")
    @ManyToOne
    private MateriaPrima materiaPrima;

    @Column(name = "IMP_LOTE")
    private String lote;

    @Column(name = "IMP_IMPORTADO")
    private Boolean esImportado;
    
    @Column(name = "IMP_FLETE")
    private Double flete;

    @Column(name = "IMP_CANTIDAD")
    private Integer cantidad;

}