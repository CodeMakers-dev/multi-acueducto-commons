package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CorreoGeneralDTO;
import com.codemakers.commons.entities.CorreoGeneralEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorreoGeneralEntity) que permite mapear los datos un objeto de tipo 
 *          (CorreoGeneralDTO) a uno de tipo (CorreoGeneralEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CorreoGeneralMapper {

	CorreoGeneralEntity dtoToEntity(CorreoGeneralDTO dto);

	CorreoGeneralDTO entityToDto(CorreoGeneralEntity entity);

    List<CorreoGeneralDTO> listEntityToDtoList(List<CorreoGeneralEntity> list);

    List<CorreoGeneralEntity> listDtoToEntity(List<CorreoGeneralDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "persona", ignore = true)
    @Mapping(target = "empresa", ignore = true)
    void updateEntityFromDto(CorreoGeneralDTO dto, @MappingTarget CorreoGeneralEntity entity);
}
