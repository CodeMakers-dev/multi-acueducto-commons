package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.ParametrosGeneralesDTO;
import com.codemakers.commons.entities.ParametrosGeneralesEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ParametrosGeneralesEntity) que permite mapear los datos un objeto de tipo 
 *          (ParametrosGeneralesDTO) a uno de tipo (ParametrosGeneralesEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface ParametrosGeneralesMapper {

	ParametrosGeneralesEntity dtoToEntity(ParametrosGeneralesDTO dto);

	ParametrosGeneralesDTO entityToDto(ParametrosGeneralesEntity entity);

    List<ParametrosGeneralesDTO> listEntityToDtoList(List<ParametrosGeneralesEntity> list);

    List<ParametrosGeneralesEntity> listDtoToEntity(List<ParametrosGeneralesDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ParametrosGeneralesDTO dto, @MappingTarget ParametrosGeneralesEntity entity);
}
