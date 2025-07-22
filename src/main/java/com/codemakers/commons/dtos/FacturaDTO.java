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
 * Clase DTO que permite encapsular los datos de un objeto de tipo (FacturaEntity).
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
public class FacturaDTO implements Serializable {

	public static final long serialVersionUID = 1L;

	private Integer id;
	
	private EmpresaClienteContadorDTO empresaClienteContador;
	
	private TarifaDTO tarifa;
	
	private LecturaDTO lectura;
	
	private TipoPagoDTO tipoPago;
	
	private EstadoDTO estado;
	
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
	
	private Boolean deudaTransferida;
}
