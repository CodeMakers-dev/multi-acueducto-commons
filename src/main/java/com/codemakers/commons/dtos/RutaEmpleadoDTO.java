package com.codemakers.commons.dtos;

import java.io.Serializable;


import java.util.Date;

import com.codemakers.commons.entities.LecturaEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nicope
 * @version 1.0
 * 
 * Clase DTO que permite encapsular los datos de un objeto de tipo (RutaEmpleadoEntity).
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
public class RutaEmpleadoDTO implements Serializable {

	public static final long serialVersionUID = 1L;

	private Integer id;
	
	private EmpresaClienteContadorDTO empresaClienteContador;
	
	private EmpleadoEmpresaDTO empleadoEmpresa;
	
	private LecturaEntity lectura;
	
	private Boolean activo;
	
	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;
}
