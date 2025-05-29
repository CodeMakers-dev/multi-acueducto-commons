package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TarifaDTO;
import com.codemakers.commons.entities.TarifaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TarifaEntity) que permite mapear los datos un objeto de tipo 
 *          (TarifaDTO) a uno de tipo (TarifaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TarifaMapper {

	TarifaMapper INSTANCE = Mappers.getMapper(TarifaMapper.class);
	
	TarifaEntity dtoToEntity(TarifaDTO dto);
	
	@InheritInverseConfiguration
	TarifaDTO entityToDto(TarifaEntity entity);
	
	List<TarifaDTO> listEntityToDtoList(List<TarifaEntity> list);
	
	List<TarifaEntity> listDtoToEntity(List<TarifaDTO> list);
}
