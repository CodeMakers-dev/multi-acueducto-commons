package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.CorreoEmpresaDTO;
import com.codemakers.commons.entities.CorreoEmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (CorreoEmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (CorreoEmpresaDTO) a uno de tipo (CorreoEmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface CorreoEmpresaMapper {

	CorreoEmpresaMapper INSTANCE = Mappers.getMapper(CorreoEmpresaMapper.class);
	
	CorreoEmpresaEntity dtoToEntity(CorreoEmpresaDTO dto);
	
	@InheritInverseConfiguration
	CorreoEmpresaDTO entityToDto(CorreoEmpresaEntity entity);
	
	List<CorreoEmpresaDTO> listEntityToDtoList(List<CorreoEmpresaEntity> list);
	
	List<CorreoEmpresaEntity> listDtoToEntity(List<CorreoEmpresaDTO> list);
}
