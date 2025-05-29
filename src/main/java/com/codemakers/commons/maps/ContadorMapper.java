package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.ContadorDTO;
import com.codemakers.commons.entities.ContadorEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ContadorEntity) que permite mapear los datos un objeto de tipo 
 *          (ContadorDTO) a uno de tipo (ContadorEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface ContadorMapper {

	ContadorMapper INSTANCE = Mappers.getMapper(ContadorMapper.class);
	
	ContadorEntity dtoToEntity(ContadorDTO dto);
	
	@InheritInverseConfiguration
	ContadorDTO entityToDto(ContadorEntity entity);
	
	List<ContadorDTO> listEntityToDtoList(List<ContadorEntity> list);
	
	List<ContadorEntity> listDtoToEntity(List<ContadorDTO> list);
}
