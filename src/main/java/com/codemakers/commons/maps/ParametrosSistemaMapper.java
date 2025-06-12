package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.ParametrosSistemaDTO;
import com.codemakers.commons.entities.ParametrosSistemaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ParametrosSistemaEntity) que permite mapear los datos un objeto de tipo 
 *          (ParametrosSistemaDTO) a uno de tipo (ParametrosSistemaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface ParametrosSistemaMapper {

	ParametrosSistemaMapper INSTANCE = Mappers.getMapper(ParametrosSistemaMapper.class);
	
	ParametrosSistemaEntity dtoToEntity(ParametrosSistemaDTO dto);
	
	@InheritInverseConfiguration
	ParametrosSistemaDTO entityToDto(ParametrosSistemaEntity entity);
	
	List<ParametrosSistemaDTO> listEntityToDtoList(List<ParametrosSistemaEntity> list);
	
	List<ParametrosSistemaEntity> listDtoToEntity(List<ParametrosSistemaDTO> list);
}
