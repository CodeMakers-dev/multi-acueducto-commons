package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CorreoEmpresaDTO;
import com.codemakers.commons.entities.CorreoEmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorreoEmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (CorreoEmpresaDTO) a uno de tipo (CorreoEmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CorreoEmpresaMapper {

	CorreoEmpresaEntity dtoToEntity(CorreoEmpresaDTO dto);

	CorreoEmpresaDTO entityToDto(CorreoEmpresaEntity entity);

    List<CorreoEmpresaDTO> listEntityToDtoList(List<CorreoEmpresaEntity> list);

    List<CorreoEmpresaEntity> listDtoToEntity(List<CorreoEmpresaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    void updateEntityFromDto(CorreoEmpresaDTO dto, @MappingTarget CorreoEmpresaEntity entity);
}
