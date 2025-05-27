package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TipoNovedadDTO;
import com.codemakers.commons.entities.TipoNovedadEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoNovedadEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoNovedadDTO) a uno de tipo (TipoNovedadEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TipoNovedadMapper {

	TipoNovedadMapper INSTANCE = Mappers.getMapper(TipoNovedadMapper.class);
	
	TipoNovedadEntity dtoToEntity(TipoNovedadDTO dto);
	
	@InheritInverseConfiguration
	TipoNovedadDTO entityToDto(TipoNovedadEntity entity);
	
	List<TipoNovedadDTO> listEntityToDtoList(List<TipoNovedadEntity> list);
	
	List<TipoNovedadEntity> listDtoToEntity(List<TipoNovedadDTO> list);
}
