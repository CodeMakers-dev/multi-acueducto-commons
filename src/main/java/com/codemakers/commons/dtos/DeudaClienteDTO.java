package com.codemakers.commons.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nicope
 * @version 1.0
 * 
 * Clase DTO que permite encapsular los datos de un objeto de tipo (DeudaClienteEntity).
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
public class DeudaClienteDTO implements Serializable {

	public static final long serialVersionUID = 1L;

	private Integer id;
	
	private EmpresaClienteContadorDTO empresaClienteContador;
	
	private TipoDeudaDTO tipoDeuda;
	
	private FacturaDTO factura;
	
	private PlazoPagoDTO plazoPago;
	
	private LocalDate fechaDeuda;
	
	private Double valor;
	
	private String descripcion;
	
	private Boolean activo;
	
	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;
}
