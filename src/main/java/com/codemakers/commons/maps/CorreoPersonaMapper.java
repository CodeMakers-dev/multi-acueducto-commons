package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CorreoPersonaDTO;
import com.codemakers.commons.entities.CorreoPersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorreoPersonaEntity) que permite mapear los datos un objeto de tipo 
 *          (CorreoPersonaDTO) a uno de tipo (CorreoPersonaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CorreoPersonaMapper {

	CorreoPersonaEntity dtoToEntity(CorreoPersonaDTO dto);

	CorreoPersonaDTO entityToDto(CorreoPersonaEntity entity);

    List<CorreoPersonaDTO> listEntityToDtoList(List<CorreoPersonaEntity> list);

    List<CorreoPersonaEntity> listDtoToEntity(List<CorreoPersonaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(CorreoPersonaDTO dto, @MappingTarget CorreoPersonaEntity entity);
}
