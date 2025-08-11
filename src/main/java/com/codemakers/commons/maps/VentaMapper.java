package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.VentaDTO;
import com.codemakers.commons.entities.VentaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (VentaEntity) que permite mapear los datos un objeto de tipo 
 *          (VentaDTO) a uno de tipo (VentaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface VentaMapper {

	VentaEntity dtoToEntity(VentaDTO dto);

	VentaDTO entityToDto(VentaEntity entity);

    List<VentaDTO> listEntityToDtoList(List<VentaEntity> list);

    List<VentaEntity> listDtoToEntity(List<VentaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "cliente", ignore = true)
    void updateEntityFromDto(VentaDTO dto, @MappingTarget VentaEntity entity);
}
