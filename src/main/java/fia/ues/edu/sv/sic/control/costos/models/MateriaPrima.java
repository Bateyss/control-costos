package fia.ues.edu.sv.sic.control.costos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MATERIA_PRIMA")
public class MateriaPrima{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MATERIA")
    private Long idMateria;

    @Column(name = "NOMBRE_MATERIA")
    private String nombreMateria;

    @Column(name = "TIPO_MATERIA")
    private String tipoMateria;

    @Column(name = "COSTO_UNITARIO_MATERIA")
    private Double costoUnitarioMateria;

    @Column(name = "COSTO_UNITARIO_MATERIA")
    private Double fleteMateria;

}