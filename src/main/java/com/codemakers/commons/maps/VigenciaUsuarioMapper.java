package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.VigenciaUsuarioDTO;
import com.codemakers.commons.entities.VigenciaUsuarioEntity;

@Mapper(componentModel = "spring")
public interface VigenciaUsuarioMapper {
	
	VigenciaUsuarioEntity dtoToEntity(VigenciaUsuarioDTO dto);

	VigenciaUsuarioDTO entityToDto(VigenciaUsuarioEntity entity);

    List<VigenciaUsuarioDTO> listEntityToDtoList(List<VigenciaUsuarioEntity> list);

    List<VigenciaUsuarioEntity> listDtoToEntity(List<VigenciaUsuarioDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "usuario", ignore = true)
    void updateEntityFromDto(VigenciaUsuarioDTO dto, @MappingTarget VigenciaUsuarioEntity entity);

}
