package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.InventarioDTO;
import com.codemakers.commons.entities.InventarioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (InventarioEntity) que permite mapear los datos un objeto de tipo 
 *          (InventarioDTO) a uno de tipo (InventarioEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface InventarioMapper {

	InventarioEntity dtoToEntity(InventarioDTO dto);

	InventarioDTO entityToDto(InventarioEntity entity);

    List<InventarioDTO> listEntityToDtoList(List<InventarioEntity> list);

    List<InventarioEntity> listDtoToEntity(List<InventarioDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "producto", ignore = true)
    void updateEntityFromDto(InventarioDTO dto, @MappingTarget InventarioEntity entity);
}
