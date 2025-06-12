package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TipoDocumentoDTO;
import com.codemakers.commons.entities.TipoDocumentoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TipoDocumentoEntity) que permite mapear los datos un objeto de tipo 
 *          (TipoDocumentoDTO) a uno de tipo (TipoDocumentoEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TipoDocumentoMapper {

	TipoDocumentoEntity dtoToEntity(TipoDocumentoDTO dto);

	TipoDocumentoDTO entityToDto(TipoDocumentoEntity entity);

    List<TipoDocumentoDTO> listEntityToDtoList(List<TipoDocumentoEntity> list);

    List<TipoDocumentoEntity> listDtoToEntity(List<TipoDocumentoDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TipoDocumentoDTO dto, @MappingTarget TipoDocumentoEntity entity);
}
