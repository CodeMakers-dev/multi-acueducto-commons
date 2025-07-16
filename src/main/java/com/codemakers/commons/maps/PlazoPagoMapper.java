package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.PlazoPagoDTO;
import com.codemakers.commons.entities.PlazoPagoEntity;

@Mapper(componentModel = "spring")
public interface PlazoPagoMapper {
   

	PlazoPagoEntity dtoToEntity(PlazoPagoDTO dto);

	PlazoPagoDTO entityToDto(PlazoPagoEntity entity);

    List<PlazoPagoDTO> listEntityToDtoList(List<PlazoPagoEntity> list);

    List<PlazoPagoEntity> listDtoToEntity(List<PlazoPagoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(PlazoPagoDTO dto, @MappingTarget PlazoPagoEntity entity);
}
