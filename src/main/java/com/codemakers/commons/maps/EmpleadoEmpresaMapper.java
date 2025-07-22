package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.codemakers.commons.dtos.EmpleadoEmpresaDTO;
import com.codemakers.commons.dtos.EmpleadoEmpresaResponseDTO;
import com.codemakers.commons.entities.EmpleadoEmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (EmpleadoEmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (EmpleadoEmpresaDTO) a uno de tipo (EmpleadoEmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper(componentModel = "spring")
public interface EmpleadoEmpresaMapper {

	EmpleadoEmpresaEntity dtoToEntity(EmpleadoEmpresaDTO dto);

	EmpleadoEmpresaDTO entityToDto(EmpleadoEmpresaEntity entity);

    List<EmpleadoEmpresaDTO> listEntityToDtoList(List<EmpleadoEmpresaEntity> list);

    List<EmpleadoEmpresaEntity> listDtoToEntity(List<EmpleadoEmpresaDTO> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "empresa", ignore = true)
    @Mapping(target = "persona", ignore = true)
    void updateEntityFromDto(EmpleadoEmpresaDTO dto, @MappingTarget EmpleadoEmpresaEntity entity);
    

    @Mapping(target = "empresaId", source = "empresa.id")
    @Mapping(target = "empresaNombre", source = "empresa.nombre")
    @Mapping(target = "personaId", source = "persona.id")
    @Mapping(target = "personaNombreCompleto", expression = "java("
    	    + "entity.getPersona().getNombre() + \" \" + "
    	    + "entity.getPersona().getSegundoNombre() + \" \" + "
    	    + "entity.getPersona().getApellido() + \" \" + "
    	    + "entity.getPersona().getSegundoApellido())")
    @Mapping(target = "numeroCedula", source = "persona.numeroCedula")
    @Mapping(target = "codigo",source = "persona.codigo")
    EmpleadoEmpresaResponseDTO entityToResumenDto(EmpleadoEmpresaEntity entity);

    List<EmpleadoEmpresaResponseDTO> listEntityToResumenDtoList(List<EmpleadoEmpresaEntity> list);
}
