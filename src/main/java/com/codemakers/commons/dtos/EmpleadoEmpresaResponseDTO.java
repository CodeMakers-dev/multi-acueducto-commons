package com.codemakers.commons.dtos;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpleadoEmpresaResponseDTO implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
    private Integer id;
	
    private Integer empresaId;
    private String empresaNombre;
    
    private Integer personaId;
    private String personaNombreCompleto;
    private String numeroCedula;
    private String codigo;
	
	private Boolean activo;
	
	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;

}
