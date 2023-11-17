package fia.ues.edu.sv.sic.control.costos.controller.abs;

import lombok.Data;

@Data
public class ErrorResponse {
    private String codigo;
	private String mensaje;
	private String error;

    public ErrorResponse(String codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public ErrorResponse(String codigo, String mensaje, String error) {
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.error = error;
	}
}


