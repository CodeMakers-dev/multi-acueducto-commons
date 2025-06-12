package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.PersonaDTO;
import com.codemakers.commons.entities.PersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (PersonaEntity) que permite mapear los datos un objeto de tipo 
 *          (PersonaDTO) a uno de tipo (PersonaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface PersonaMapper {

	PersonaEntity dtoToEntity(PersonaDTO dto);

    PersonaDTO entityToDto(PersonaEntity entity);

    List<PersonaDTO> listEntityToDtoList(List<PersonaEntity> list);

    List<PersonaEntity> listDtoToEntity(List<PersonaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "direccion", ignore = true)
    @Mapping(target = "tipoDocumento", ignore = true)
    void updateEntityFromDto(PersonaDTO dto, @MappingTarget PersonaEntity entity);
}
