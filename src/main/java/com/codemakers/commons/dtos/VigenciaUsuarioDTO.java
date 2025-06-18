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
public class VigenciaUsuarioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
    private String token;
    
    private UsuarioDTO usuario;

    private Date fechaVigencia;

	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;

	private Boolean activo;
}