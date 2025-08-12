package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.VentaProductoDTO;
import com.codemakers.commons.entities.VentaProductoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (VentaProductoEntity) que permite mapear los datos un objeto de tipo 
 *          (VentaProductoDTO) a uno de tipo (VentaProductoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface VentaProductoMapper {

	VentaProductoEntity dtoToEntity(VentaProductoDTO dto);

	VentaProductoDTO entityToDto(VentaProductoEntity entity);

    List<VentaProductoDTO> listEntityToDtoList(List<VentaProductoEntity> list);

    List<VentaProductoEntity> listDtoToEntity(List<VentaProductoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "venta", ignore = true)
    @Mapping(target = "producto", ignore = true)
    void updateEntityFromDto(VentaProductoDTO dto, @MappingTarget VentaProductoEntity entity);
}
