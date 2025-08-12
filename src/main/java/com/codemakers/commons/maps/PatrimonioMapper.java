package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.PatrimonioDTO;
import com.codemakers.commons.entities.PatrimonioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (PatrimonioEntity) que permite mapear los datos un objeto de tipo 
 *          (PatrimonioDTO) a uno de tipo (PatrimonioEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface PatrimonioMapper {

	PatrimonioEntity dtoToEntity(PatrimonioDTO dto);

	PatrimonioDTO entityToDto(PatrimonioEntity entity);

    List<PatrimonioDTO> listEntityToDtoList(List<PatrimonioEntity> list);

    List<PatrimonioEntity> listDtoToEntity(List<PatrimonioDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    void updateEntityFromDto(PatrimonioDTO dto, @MappingTarget PatrimonioEntity entity);
}
