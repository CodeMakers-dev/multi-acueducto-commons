package com.codemakers.commons.dtos;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nicope
 * @version 1.0
 * 
 * Clase DTO que permite encapsular los datos de un objeto de tipo (TelefonoGeneralEntity).
 * Este DTO tiene varias ventajas como: 
 * Bajo acoplamiento entre las capaz de la aplicación
 * Optimización de la transferencia de datos.
 * Seguridad.
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefonoGeneralDTO implements Serializable {

	public static final long serialVersionUID = 1L;

	private Integer id;
	
	private PersonaDTO persona;
	
	private EmpresaDTO empresa;
	
	private String numero;
	
	private Boolean activo;
	
	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;
}
