package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TipoDeudaDTO;
import com.codemakers.commons.entities.TipoDeudaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoDeudaEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoDeudaDTO) a uno de tipo (TipoDeudaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TipoDeudaMapper {

	TipoDeudaEntity dtoToEntity(TipoDeudaDTO dto);

	TipoDeudaDTO entityToDto(TipoDeudaEntity entity);

    List<TipoDeudaDTO> listEntityToDtoList(List<TipoDeudaEntity> list);

    List<TipoDeudaEntity> listDtoToEntity(List<TipoDeudaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TipoDeudaDTO dto, @MappingTarget TipoDeudaEntity entity);
}
