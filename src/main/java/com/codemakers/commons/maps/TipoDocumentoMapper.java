package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TipoDocumentoDTO;
import com.codemakers.commons.entities.TipoDocumentoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoDocumentoEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoDocumentoDTO) a uno de tipo (TipoDocumentoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TipoDocumentoMapper {

	TipoDocumentoMapper INSTANCE = Mappers.getMapper(TipoDocumentoMapper.class);
	
	TipoDocumentoEntity dtoToEntity(TipoDocumentoDTO dto);
	
	@InheritInverseConfiguration
	TipoDocumentoDTO entityToDto(TipoDocumentoEntity entity);
	
	List<TipoDocumentoDTO> listEntityToDtoList(List<TipoDocumentoEntity> list);
	
	List<TipoDocumentoEntity> listDtoToEntity(List<TipoDocumentoDTO> list);
}
