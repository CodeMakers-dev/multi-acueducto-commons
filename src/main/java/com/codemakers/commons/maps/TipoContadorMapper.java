package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TipoContadorDTO;
import com.codemakers.commons.entities.TipoContadorEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoContadorEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoContadorDTO) a uno de tipo (TipoContadorEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TipoContadorMapper {

	TipoContadorMapper INSTANCE = Mappers.getMapper(TipoContadorMapper.class);
	
	TipoContadorEntity dtoToEntity(TipoContadorDTO dto);
	
	@InheritInverseConfiguration
	TipoContadorDTO entityToDto(TipoContadorEntity entity);
	
	List<TipoContadorDTO> listEntityToDtoList(List<TipoContadorEntity> list);
	
	List<TipoContadorEntity> listDtoToEntity(List<TipoContadorDTO> list);
}
