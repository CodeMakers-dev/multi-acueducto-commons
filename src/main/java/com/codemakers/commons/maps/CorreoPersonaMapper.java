package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.CorreoPersonaDTO;
import com.codemakers.commons.entities.CorreoPersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorreoPersonaEntity) que permite mapear los datos un objeto de tipo 
 *          (CorreoPersonaDTO) a uno de tipo (CorreoPersonaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface CorreoPersonaMapper {

	CorreoPersonaMapper INSTANCE = Mappers.getMapper(CorreoPersonaMapper.class);
	
	CorreoPersonaEntity dtoToEntity(CorreoPersonaDTO dto);
	
	@InheritInverseConfiguration
	CorreoPersonaDTO entityToDto(CorreoPersonaEntity entity);
	
	List<CorreoPersonaDTO> listEntityToDtoList(List<CorreoPersonaEntity> list);
	
	List<CorreoPersonaEntity> listDtoToEntity(List<CorreoPersonaDTO> list);
}
