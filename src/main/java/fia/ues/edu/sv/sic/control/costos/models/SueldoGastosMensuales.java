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
@Table(name = "SUELDOS_GASTOS_MENSUALES")
public class SueldoGastosMensuales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUELGO_GASTO_MENSUAL")
    private Long idSueldoGastoMensual;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "INVERSION_MENSUAL")
    private Double inversionMensual;
    @Column(name = "ACTIVO")
    private Boolean activo;
}
