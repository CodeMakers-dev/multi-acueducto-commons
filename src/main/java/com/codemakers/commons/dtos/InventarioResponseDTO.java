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
 * Clase DTO que permite optimizar el response del servicio obtener
 * Inventario por id de Empresa
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventarioResponseDTO implements Serializable {

	public static final long serialVersionUID = 1L;
	private Integer id;
    private Integer cantidad;
    private Double precioUnitario;
    private Double precioVenta;
    private Integer porcentaje;

    private Integer productoId;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Boolean activo;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;

}
