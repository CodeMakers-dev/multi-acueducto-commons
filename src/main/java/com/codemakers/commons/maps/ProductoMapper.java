package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.ProductoDTO;
import com.codemakers.commons.entities.ProductoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ProductoEntity) que permite mapear los datos un objeto de tipo 
 *          (ProductoDTO) a uno de tipo (ProductoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface ProductoMapper {

	ProductoEntity dtoToEntity(ProductoDTO dto);

	ProductoDTO entityToDto(ProductoEntity entity);

    List<ProductoDTO> listEntityToDtoList(List<ProductoEntity> list);

    List<ProductoEntity> listDtoToEntity(List<ProductoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "categoria", ignore = true)
    void updateEntityFromDto(ProductoDTO dto, @MappingTarget ProductoEntity entity);
}
