package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.LecturaDTO;
import com.codemakers.commons.entities.LecturaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (LecturaEntity) que permite mapear los datos un objeto de tipo 
 *          (LecturaDTO) a uno de tipo (LecturaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface LecturaMapper {

	LecturaMapper INSTANCE = Mappers.getMapper(LecturaMapper.class);
	
	LecturaEntity dtoToEntity(LecturaDTO dto);
	
	@InheritInverseConfiguration
	LecturaDTO entityToDto(LecturaEntity entity);
	
	List<LecturaDTO> listEntityToDtoList(List<LecturaEntity> list);
	
	List<LecturaEntity> listDtoToEntity(List<LecturaDTO> list);
}
