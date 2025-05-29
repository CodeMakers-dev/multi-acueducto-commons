package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.UsuarioDTO;
import com.codemakers.commons.entities.UsuarioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (UsuarioEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoTarifaDTO) a uno de tipo (UsuarioEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface UsuarioMapper {

	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioEntity dtoToEntity(UsuarioDTO dto);
	
	@InheritInverseConfiguration
	UsuarioDTO entityToDto(UsuarioEntity entity);
	
	List<UsuarioDTO> listEntityToDtoList(List<UsuarioEntity> list);
	
	List<UsuarioEntity> listDtoToEntity(List<UsuarioDTO> list);
}
