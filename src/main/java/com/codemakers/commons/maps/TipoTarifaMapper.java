package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TipoTarifaDTO;
import com.codemakers.commons.entities.TipoTarifaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoTarifaEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoTarifaDTO) a uno de tipo (TipoTarifaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TipoTarifaMapper {

	TipoTarifaEntity dtoToEntity(TipoTarifaDTO dto);

	TipoTarifaDTO entityToDto(TipoTarifaEntity entity);

    List<TipoTarifaDTO> listEntityToDtoList(List<TipoTarifaEntity> list);

    List<TipoTarifaEntity> listDtoToEntity(List<TipoTarifaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TipoTarifaDTO dto, @MappingTarget TipoTarifaEntity entity);
}
