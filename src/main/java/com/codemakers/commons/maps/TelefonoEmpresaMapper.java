package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.TelefonoEmpresaDTO;
import com.codemakers.commons.entities.TelefonoEmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TelefonoEmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (TelefonoEmpresaDTO) a uno de tipo (TelefonoEmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface TelefonoEmpresaMapper {

	TelefonoEmpresaEntity dtoToEntity(TelefonoEmpresaDTO dto);

	TelefonoEmpresaDTO entityToDto(TelefonoEmpresaEntity entity);

    List<TelefonoEmpresaDTO> listEntityToDtoList(List<TelefonoEmpresaEntity> list);

    List<TelefonoEmpresaEntity> listDtoToEntity(List<TelefonoEmpresaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    void updateEntityFromDto(TelefonoEmpresaDTO dto, @MappingTarget TelefonoEmpresaEntity entity);
}
