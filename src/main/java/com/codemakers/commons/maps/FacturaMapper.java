package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.FacturaDTO;
import com.codemakers.commons.entities.FacturaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (FacturaEntity) que permite mapear los datos un objeto de tipo 
 *          (FacturaDTO) a uno de tipo (FacturaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface FacturaMapper {

	FacturaMapper INSTANCE = Mappers.getMapper(FacturaMapper.class);
	
	FacturaEntity dtoToEntity(FacturaDTO dto);
	
	@InheritInverseConfiguration
	FacturaDTO entityToDto(FacturaEntity entity);
	
	List<FacturaDTO> listEntityToDtoList(List<FacturaEntity> list);
	
	List<FacturaEntity> listDtoToEntity(List<FacturaDTO> list);
}
