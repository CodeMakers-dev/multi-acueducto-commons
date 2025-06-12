package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

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

@Mapper(componentModel = "spring")
public interface TarifaMapper {

	TarifaEntity dtoToEntity(TarifaDTO dto);

	TarifaDTO entityToDto(TarifaEntity entity);

    List<TarifaDTO> listEntityToDtoList(List<TarifaEntity> list);

    List<TarifaEntity> listDtoToEntity(List<TarifaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "tipoTarifa", ignore = true)
    void updateEntityFromDto(TarifaDTO dto, @MappingTarget TarifaEntity entity);
}
