package com.codemakers.commons.dtos;

import lombok.Data;

@Data
public class UpdatePasswordDTO {
	private String nuevaContrasena;
    private String usuarioModificacion;
}
