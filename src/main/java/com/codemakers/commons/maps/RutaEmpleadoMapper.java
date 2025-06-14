package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.RutaEmpleadoDTO;
import com.codemakers.commons.entities.RutaEmpleadoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (RutaEmpleadoEntity) que permite mapear los datos un objeto de tipo 
 *          (RutaEmpleadoDTO) a uno de tipo (RutaEmpleadoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface RutaEmpleadoMapper {

	RutaEmpleadoMapper INSTANCE = Mappers.getMapper(RutaEmpleadoMapper.class);
	
	RutaEmpleadoEntity dtoToEntity(RutaEmpleadoDTO dto);
	
	@InheritInverseConfiguration
	RutaEmpleadoDTO entityToDto(RutaEmpleadoEntity entity);
	
	List<RutaEmpleadoDTO> listEntityToDtoList(List<RutaEmpleadoEntity> list);
	
	List<RutaEmpleadoEntity> listDtoToEntity(List<RutaEmpleadoDTO> list);
}
