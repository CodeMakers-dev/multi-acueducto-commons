package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CorregimientoDTO;
import com.codemakers.commons.entities.CorregimientoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorregimientoEntity) que permite mapear los datos un objeto de tipo 
 *          (CorregimientoDTO) a uno de tipo (CorregimientoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CorregimientoMapper {
	
	CorregimientoEntity dtoToEntity(CorregimientoDTO dto);

	CorregimientoDTO entityToDto(CorregimientoEntity entity);

    List<CorregimientoDTO> listEntityToDtoList(List<CorregimientoEntity> list);

    List<CorregimientoEntity> listDtoToEntity(List<CorregimientoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(CorregimientoDTO dto, @MappingTarget CorregimientoEntity entity);
}
