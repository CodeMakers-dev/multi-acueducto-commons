package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.CiudadDTO;
import com.codemakers.commons.entities.CiudadEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CiudadEntity) que permite mapear los datos un objeto de tipo 
 *          (CiudadDTO) a uno de tipo (CiudadEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface CiudadMapper {

	CiudadMapper INSTANCE = Mappers.getMapper(CiudadMapper.class);
	
	CiudadEntity dtoToEntity(CiudadDTO dto);
	
	@InheritInverseConfiguration
	CiudadDTO entityToDto(CiudadEntity entity);
	
	List<CiudadDTO> listEntityToDtoList(List<CiudadEntity> list);
	
	List<CiudadEntity> listDtoToEntity(List<CiudadDTO> list);
}
