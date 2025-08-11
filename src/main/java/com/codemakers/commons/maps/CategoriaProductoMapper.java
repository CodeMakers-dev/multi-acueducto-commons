package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CategoriaProductoDTO;
import com.codemakers.commons.entities.CategoriaProductoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CategoriaProductoEntity) que permite mapear los datos un objeto de tipo 
 *          (CategoriaProductoDTO) a uno de tipo (CategoriaProductoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CategoriaProductoMapper {

	CategoriaProductoEntity dtoToEntity(CategoriaProductoDTO dto);

	CategoriaProductoDTO entityToDto(CategoriaProductoEntity entity);

    List<CategoriaProductoDTO> listEntityToDtoList(List<CategoriaProductoEntity> list);

    List<CategoriaProductoEntity> listDtoToEntity(List<CategoriaProductoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(CategoriaProductoDTO dto, @MappingTarget CategoriaProductoEntity entity);
}
