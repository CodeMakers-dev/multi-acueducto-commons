package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.CuentaDTO;
import com.codemakers.commons.entities.CuentaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CuentaEntity) que permite mapear los datos un objeto de tipo 
 *          (CuentaDTO) a uno de tipo (CuentaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface CuentaMapper {

	CuentaEntity dtoToEntity(CuentaDTO dto);

	CuentaDTO entityToDto(CuentaEntity entity);

    List<CuentaDTO> listEntityToDtoList(List<CuentaEntity> list);

    List<CuentaEntity> listDtoToEntity(List<CuentaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "tipoCuenta", ignore = true)
    void updateEntityFromDto(CuentaDTO dto, @MappingTarget CuentaEntity entity);
}
