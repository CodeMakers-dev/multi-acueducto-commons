package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.DireccionDTO;
import com.codemakers.commons.entities.DireccionEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (DireccionEntity) que permite mapear los datos un objeto de tipo 
 *          (DireccionDTO) a uno de tipo (DireccionEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface DireccionMapper {

	DireccionMapper INSTANCE = Mappers.getMapper(DireccionMapper.class);
	
	DireccionEntity dtoToEntity(DireccionDTO dto);
	
	@InheritInverseConfiguration
	DireccionDTO entityToDto(DireccionEntity entity);
	
	List<DireccionDTO> listEntityToDtoList(List<DireccionEntity> list);
	
	List<DireccionEntity> listDtoToEntity(List<DireccionDTO> list);
}
