package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.RolDTO;
import com.codemakers.commons.entities.RolEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (RolEntity) que permite mapear los datos un objeto de tipo 
 *          (RolDTO) a uno de tipo (RolEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface RolMapper {

	RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);
	
	RolEntity dtoToEntity(RolDTO dto);
	
	@InheritInverseConfiguration
	RolDTO entityToDto(RolEntity entity);
	
	List<RolDTO> listEntityToDtoList(List<RolEntity> list);
	
	List<RolEntity> listDtoToEntity(List<RolDTO> list);
}
