package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TipoCuentaContableDTO;
import com.codemakers.commons.entities.TipoCuentaContableEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoCuentaContableEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoCuentaContableDTO) a uno de tipo (TipoCuentaContableEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TipoCuentaContableMapper {

	TipoCuentaContableEntity dtoToEntity(TipoCuentaContableDTO dto);

	TipoCuentaContableDTO entityToDto(TipoCuentaContableEntity entity);

    List<TipoCuentaContableDTO> listEntityToDtoList(List<TipoCuentaContableEntity> list);

    List<TipoCuentaContableEntity> listDtoToEntity(List<TipoCuentaContableDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TipoCuentaContableDTO dto, @MappingTarget TipoCuentaContableEntity entity);
}
