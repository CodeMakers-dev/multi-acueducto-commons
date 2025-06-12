package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.ParametrosGeneralesDTO;
import com.codemakers.commons.entities.ParametrosGeneralesEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ParametrosGeneralesEntity) que permite mapear los datos un objeto de tipo 
 *          (ParametrosGeneralesDTO) a uno de tipo (ParametrosGeneralesEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface ParametrosGeneralesMapper {

	ParametrosGeneralesMapper INSTANCE = Mappers.getMapper(ParametrosGeneralesMapper.class);
	
	ParametrosGeneralesEntity dtoToEntity(ParametrosGeneralesDTO dto);
	
	@InheritInverseConfiguration
	ParametrosGeneralesDTO entityToDto(ParametrosGeneralesEntity entity);
	
	List<ParametrosGeneralesDTO> listEntityToDtoList(List<ParametrosGeneralesEntity> list);
	
	List<ParametrosGeneralesEntity> listDtoToEntity(List<ParametrosGeneralesDTO> list);
}
