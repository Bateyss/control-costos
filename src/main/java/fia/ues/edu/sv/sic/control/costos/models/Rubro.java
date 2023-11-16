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
@Table(name = "RUBRO")
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RUBRO")
    private Long idRubro;

    @Column(name = "NOMBRE_RUBRO")
    private String nombreRubro;

    
    
}