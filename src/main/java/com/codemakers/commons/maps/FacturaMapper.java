package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.FacturaDTO;
import com.codemakers.commons.entities.FacturaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (FacturaEntity) que permite mapear los datos un objeto de tipo 
 *          (FacturaDTO) a uno de tipo (FacturaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface FacturaMapper {

	FacturaEntity dtoToEntity(FacturaDTO dto);

	FacturaDTO entityToDto(FacturaEntity entity);

    List<FacturaDTO> listEntityToDtoList(List<FacturaEntity> list);

    List<FacturaEntity> listDtoToEntity(List<FacturaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresaClienteContador", ignore = true)
    @Mapping(target = "tarifa", ignore = true)
    @Mapping(target = "lectura", ignore = true)
    @Mapping(target = "tipoPago", ignore = true)
    @Mapping(target = "estado", ignore = true)
    void updateEntityFromDto(FacturaDTO dto, @MappingTarget FacturaEntity entity);
}
