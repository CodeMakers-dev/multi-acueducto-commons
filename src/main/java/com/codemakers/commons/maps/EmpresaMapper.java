package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.EmpresaDTO;
import com.codemakers.commons.dtos.EmpresaResponseDTO;
import com.codemakers.commons.entities.EmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (EmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (EmpresaDTO) a uno de tipo (EmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface EmpresaMapper {

	EmpresaEntity dtoToEntity(EmpresaDTO dto);

	EmpresaDTO entityToDto(EmpresaEntity entity);

    List<EmpresaDTO> listEntityToDtoList(List<EmpresaEntity> list);

    List<EmpresaEntity> listDtoToEntity(List<EmpresaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "usuario", ignore = true)
    @Mapping(target = "estado", ignore = true)
    @Mapping(target = "direccion", ignore = true)
    void updateEntityFromDto(EmpresaDTO dto, @MappingTarget EmpresaEntity entity);
    
    @Mapping(target = "departamento", source = "direccion.departamentoId.nombre")
    @Mapping(target = "ciudad", source = "direccion.ciudadId.nombre")
    @Mapping(target = "corregimiento", source = "direccion.corregimientoId.nombre")
    @Mapping(target = "descripcionDireccion", source = "direccion.descripcion")
    EmpresaResponseDTO entityToResumenDto(EmpresaEntity entity);

    List<EmpresaResponseDTO> listEntityToResumenDtoList(List<EmpresaEntity> list);
}
