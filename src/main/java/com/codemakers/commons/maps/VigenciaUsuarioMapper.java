package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.VigenciaUsuarioDTO;
import com.codemakers.commons.entities.VigenciaUsuarioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (VigenciaUsuarioEntity) que permite mapear los datos un objeto de tipo 
 *          (VigenciaUsuarioDTO) a uno de tipo (VigenciaUsuarioEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface VigenciaUsuarioMapper {

	VigenciaUsuarioMapper INSTANCE = Mappers.getMapper(VigenciaUsuarioMapper.class);
	
	VigenciaUsuarioEntity dtoToEntity(VigenciaUsuarioDTO dto);
	
	@InheritInverseConfiguration
	VigenciaUsuarioDTO entityToDto(VigenciaUsuarioEntity entity);
	
	List<VigenciaUsuarioDTO> listEntityToDtoList(List<VigenciaUsuarioEntity> list);
	
	List<VigenciaUsuarioEntity> listDtoToEntity(List<VigenciaUsuarioDTO> list);
}
