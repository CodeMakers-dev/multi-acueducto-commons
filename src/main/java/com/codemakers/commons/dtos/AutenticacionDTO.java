package com.codemakers.commons.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nicope
 * @version 1.0
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutenticacionDTO {

	private Integer id;
    private String nombre;
    private String token;
    private Integer rolId;
    private Integer personaId;
    
}
