package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.AbonoDTO;
import com.codemakers.commons.entities.AbonoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (AbonoEntity) que permite mapear los datos un objeto de tipo 
 *          (AbonoDTO) a uno de tipo (AbonoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface AbonoMapper {

	AbonoMapper INSTANCE = Mappers.getMapper(AbonoMapper.class);
	
	AbonoEntity dtoToEntity(AbonoDTO dto);
	
	@InheritInverseConfiguration
	AbonoDTO entityToDto(AbonoEntity entity);
	
	List<AbonoDTO> listEntityToDtoList(List<AbonoEntity> list);
	
	List<AbonoEntity> listDtoToEntity(List<AbonoDTO> list);
}
