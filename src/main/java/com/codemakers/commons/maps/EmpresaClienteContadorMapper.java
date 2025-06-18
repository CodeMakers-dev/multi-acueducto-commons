package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.EmpresaClienteContadorDTO;
import com.codemakers.commons.entities.EmpresaClienteContadorEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (EmpresaClienteContadorEntity) que permite mapear los datos un objeto de tipo 
 *          (EmpresaClienteContadorDTO) a uno de tipo (EmpresaClienteContadorEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface EmpresaClienteContadorMapper{

	EmpresaClienteContadorEntity dtoToEntity(EmpresaClienteContadorDTO dto);

	EmpresaClienteContadorDTO entityToDto(EmpresaClienteContadorEntity entity);

    List<EmpresaClienteContadorDTO> listEntityToDtoList(List<EmpresaClienteContadorEntity> list);

    List<EmpresaClienteContadorEntity> listDtoToEntity(List<EmpresaClienteContadorDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "cliente", ignore = true)
    @Mapping(target = "contador", ignore = true)
    void updateEntityFromDto(EmpresaClienteContadorDTO dto, @MappingTarget EmpresaClienteContadorEntity entity);
}
