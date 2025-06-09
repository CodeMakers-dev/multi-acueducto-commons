package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.UsuarioDTO;
import com.codemakers.commons.entities.UsuarioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (UsuarioEntity) que permite mapear los datos un objeto de tipo 
 *          (UsuarioDTO) a uno de tipo (UsuarioEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	UsuarioEntity dtoToEntity(UsuarioDTO dto);

	UsuarioDTO entityToDto(UsuarioEntity entity);

    List<UsuarioDTO> listEntityToDtoList(List<UsuarioEntity> list);

    List<UsuarioEntity> listDtoToEntity(List<UsuarioDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "rol", ignore = true)
    @Mapping(target = "persona", ignore = true)
    void updateEntityFromDto(UsuarioDTO dto, @MappingTarget UsuarioEntity entity);
}
