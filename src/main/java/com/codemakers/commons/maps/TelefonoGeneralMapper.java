package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TelefonoGeneralDTO;
import com.codemakers.commons.entities.TelefonoGeneralEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TelefonoGeneralEntity) que permite mapear los datos un objeto de tipo 
 *          (TelefonoGeneralDTO) a uno de tipo (TelefonoGeneralEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TelefonoGeneralMapper {

	TelefonoGeneralEntity dtoToEntity(TelefonoGeneralDTO dto);

	TelefonoGeneralDTO entityToDto(TelefonoGeneralEntity entity);

    List<TelefonoGeneralDTO> listEntityToDtoList(List<TelefonoGeneralEntity> list);

    List<TelefonoGeneralEntity> listDtoToEntity(List<TelefonoGeneralDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "persona", ignore = true)
    @Mapping(target = "empresa", ignore = true)
    void updateEntityFromDto(TelefonoGeneralDTO dto, @MappingTarget TelefonoGeneralEntity entity);
}
