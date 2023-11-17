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
@Table(name = "GASTOS_ADMINISTRATIVOS")
public class GastosAdministrativos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GASTO_ADMINISTRATIVO")
    private Long idGastoAdministrativo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "INVERSION_MENSUAL")
    private Double inversionMensual;
    @Column(name = "ACTIVO")
    private Boolean activo;
}
