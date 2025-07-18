package com.codemakers.commons.dtos;

import java.io.Serializable;
import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacturaResponseDTO implements Serializable {

	public static final long serialVersionUID = 1L;
	    private Integer id;
	    private Integer empresaClienteContadorId;
	    private Integer personaId;
	    private String nombre;
	    private String segundoNombre;
	    private String apellido;
	    private String segundoApellido;

	    private Integer tarifaId;
	    private Double tarifaValor;

	    private Integer lecturaId;
	    private Boolean consumoAnormal;

	    private Integer tipoPagoId;
	    private String tipoPagoNombre;

	    private Integer estadoId;
	    private String estadoNombre;

	    private Date fechaEmision;
	    private Date fechaFin;
	    private Integer consumo;
	    private Double precio;
	    private String codigo;
	    private Boolean activo;

	    private String usuarioCreacion;
	    private Date fechaCreacion;
	    private String usuarioModificacion;
	    private Date fechaModificacion;
}
