package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.DepartamentoDTO;
import com.codemakers.commons.entities.DepartamentoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (DepartamentoEntity) que permite mapear los datos un objeto de tipo 
 *          (DepartamentoDTO) a uno de tipo (DepartamentoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface DepartamentoMapper {

	DepartamentoMapper INSTANCE = Mappers.getMapper(DepartamentoMapper.class);
	
	DepartamentoEntity dtoToEntity(DepartamentoDTO dto);
	
	@InheritInverseConfiguration
	DepartamentoDTO entityToDto(DepartamentoEntity entity);
	
	List<DepartamentoDTO> listEntityToDtoList(List<DepartamentoEntity> list);
	
	List<DepartamentoEntity> listDtoToEntity(List<DepartamentoDTO> list);
}
