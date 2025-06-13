package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.EstadoDTO;
import com.codemakers.commons.entities.EstadoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (EstadoEntity) que permite mapear los datos un objeto de tipo 
 *          (EstadoDTO) a uno de tipo (EstadoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface EstadoMapper {

	EstadoEntity dtoToEntity(EstadoDTO dto);

	EstadoDTO entityToDto(EstadoEntity entity);

    List<EstadoDTO> listEntityToDtoList(List<EstadoEntity> list);

    List<EstadoEntity> listDtoToEntity(List<EstadoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(EstadoDTO dto, @MappingTarget EstadoEntity entity);
}
