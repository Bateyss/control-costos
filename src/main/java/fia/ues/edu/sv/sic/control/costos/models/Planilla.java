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
@Table(name = "PLANILLA")
public class Planilla{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANILLA")
    private Long idPlanilla;

    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;

    @JoinColumn(name = "ID_PUESTO", referencedColumnName = "ID_PUESTO")
    @ManyToOne
    private Puesto puesto;

    @Column(name = "ES_EMPLEADO_DIRECTO")
    private Boolean esEmpleadoDirecto;

    @Column(name = "SALARIO")
    private Double salarioMensual;

    @Column(name = "NUMERO_EMPLEADOS")
    private Integer numeroEmpleados;

    public Double obtenerCalculoAFP(Double porcentaje){
        return this.salarioMensual * porcentaje;
    }

    public Double obtenerCalculoISSS(Double porcentaje){
        return this.salarioMensual * porcentaje;
    }

    public Double obtenerCalculoNocturnidadMensual(Integer numeroHoras){
        return (this.obtenerSalarioHora() * 0.25) * numeroHoras;
    }

    public Double obtenerCalculoHorasExtra(Integer numeroHoras){
        return (this.obtenerSalarioHora() * 2.0) * numeroHoras;
    }

    public Double obtenerCalculoHorasExtraNocturnas(Integer numeroHoras){
        return (this.obtenerSalarioHora() * 2.5) * numeroHoras;
    }

    public Double obtenerSalarioHora(){
        return (this.salarioMensual / 30)/ 8;
    }

}