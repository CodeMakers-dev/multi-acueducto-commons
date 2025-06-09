package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.LecturaDTO;
import com.codemakers.commons.entities.LecturaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (LecturaEntity) que permite mapear los datos un objeto de tipo 
 *          (LecturaDTO) a uno de tipo (LecturaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface LecturaMapper {

	LecturaEntity dtoToEntity(LecturaDTO dto);

	LecturaDTO entityToDto(LecturaEntity entity);

    List<LecturaDTO> listEntityToDtoList(List<LecturaEntity> list);

    List<LecturaEntity> listDtoToEntity(List<LecturaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "contador", ignore = true)
    void updateEntityFromDto(LecturaDTO dto, @MappingTarget LecturaEntity entity);
}
