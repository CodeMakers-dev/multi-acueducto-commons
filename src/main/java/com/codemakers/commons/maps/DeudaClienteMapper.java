package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.DeudaClienteDTO;
import com.codemakers.commons.entities.DeudaClienteEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (DeudaClienteEntity) que permite mapear los datos un objeto de tipo 
 *          (DeudaClienteDTO) a uno de tipo (DeudaClienteEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface DeudaClienteMapper {

	DeudaClienteMapper INSTANCE = Mappers.getMapper(DeudaClienteMapper.class);
	
	DeudaClienteEntity dtoToEntity(DeudaClienteDTO dto);
	
	@InheritInverseConfiguration
	DeudaClienteDTO entityToDto(DeudaClienteEntity entity);
	
	List<DeudaClienteDTO> listEntityToDtoList(List<DeudaClienteEntity> list);
	
	List<DeudaClienteEntity> listDtoToEntity(List<DeudaClienteDTO> list);
}
