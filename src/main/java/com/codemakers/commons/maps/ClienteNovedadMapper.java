package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.ClienteNovedadDTO;
import com.codemakers.commons.entities.ClienteNovedadEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ClienteNovedadEntity) que permite mapear los datos un objeto de tipo 
 *          (ClienteNovedadDTO) a uno de tipo (ClienteNovedadEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface ClienteNovedadMapper {

	ClienteNovedadEntity dtoToEntity(ClienteNovedadDTO dto);

	ClienteNovedadDTO entityToDto(ClienteNovedadEntity entity);

    List<ClienteNovedadDTO> listEntityToDtoList(List<ClienteNovedadEntity> list);

    List<ClienteNovedadEntity> listDtoToEntity(List<ClienteNovedadDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "factura", ignore = true)
    @Mapping(target = "tipoNovedad", ignore = true)
    void updateEntityFromDto(ClienteNovedadDTO dto, @MappingTarget ClienteNovedadEntity entity);
}
