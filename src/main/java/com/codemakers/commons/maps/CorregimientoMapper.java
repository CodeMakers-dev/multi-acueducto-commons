package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.CorregimientoDTO;
import com.codemakers.commons.entities.CorregimientoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorregimientoEntity) que permite mapear los datos un objeto de tipo 
 *          (CorregimientoDTO) a uno de tipo (CorregimientoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface CorregimientoMapper {
	
	CorregimientoMapper INSTANCE = Mappers.getMapper(CorregimientoMapper.class);
	
	CorregimientoEntity dtoToEntity(CorregimientoDTO dto);
	
	@InheritInverseConfiguration
	CorregimientoDTO entityToDto(CorregimientoEntity entity);
	
	List<CorregimientoDTO> listEntityToDtoList(List<CorregimientoEntity> list);
	
	List<CorregimientoEntity> listDtoToEntity(List<CorregimientoDTO> list);
}
