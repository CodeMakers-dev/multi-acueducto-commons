package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TipoTarifaDTO;
import com.codemakers.commons.entities.TipoTarifaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoTarifaEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoTarifaDTO) a uno de tipo (TipoTarifaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TipoTarifaMapper {

	TipoTarifaMapper INSTANCE = Mappers.getMapper(TipoTarifaMapper.class);
	
	TipoTarifaEntity dtoToEntity(TipoTarifaDTO dto);
	
	@InheritInverseConfiguration
	TipoTarifaDTO entityToDto(TipoTarifaEntity entity);
	
	List<TipoTarifaDTO> listEntityToDtoList(List<TipoTarifaEntity> list);
	
	List<TipoTarifaEntity> listDtoToEntity(List<TipoTarifaDTO> list);
}
