package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.ContadorDTO;
import com.codemakers.commons.entities.ContadorEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ContadorEntity) que permite mapear los datos un objeto de tipo 
 *          (ContadorDTO) a uno de tipo (ContadorEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface ContadorMapper {

	ContadorEntity dtoToEntity(ContadorDTO dto);

	ContadorDTO entityToDto(ContadorEntity entity);

    List<ContadorDTO> listEntityToDtoList(List<ContadorEntity> list);

    List<ContadorEntity> listDtoToEntity(List<ContadorDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "cliente", ignore = true)
    @Mapping(target = "tipoContador", ignore = true)
    @Mapping(target = "descripcion", ignore = true)
    void updateEntityFromDto(ContadorDTO dto, @MappingTarget ContadorEntity entity);
}
