package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TipoPagoDTO;
import com.codemakers.commons.entities.TipoPagoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoPagoEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoPagoDTO) a uno de tipo (TipoPagoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TipoPagoMapper {

	TipoPagoEntity dtoToEntity(TipoPagoDTO dto);

	TipoPagoDTO entityToDto(TipoPagoEntity entity);

    List<TipoPagoDTO> listEntityToDtoList(List<TipoPagoEntity> list);

    List<TipoPagoEntity> listDtoToEntity(List<TipoPagoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TipoPagoDTO dto, @MappingTarget TipoPagoEntity entity);
}
