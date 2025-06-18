package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.AbonoDTO;
import com.codemakers.commons.entities.AbonoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (AbonoEntity) que permite mapear los datos un objeto de tipo 
 *          (AbonoDTO) a uno de tipo (AbonoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface AbonoMapper {

	AbonoEntity dtoToEntity(AbonoDTO dto);

	AbonoDTO entityToDto(AbonoEntity entity);

    List<AbonoDTO> listEntityToDtoList(List<AbonoEntity> list);

    List<AbonoEntity> listDtoToEntity(List<AbonoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "deudaCliente", ignore = true)
    void updateEntityFromDto(AbonoDTO dto, @MappingTarget AbonoEntity entity);
}
