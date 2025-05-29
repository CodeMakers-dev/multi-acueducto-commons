package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.EmpresaDTO;
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

@Mapper
public interface EmpresaMapper {

	EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);
	
	EmpresaEntity dtoToEntity(EmpresaDTO dto);
	
	@InheritInverseConfiguration
	EmpresaDTO entityToDto(EmpresaEntity entity);
	
	List<EmpresaDTO> listEntityToDtoList(List<EmpresaEntity> list);
	
	List<EmpresaEntity> listDtoToEntity(List<EmpresaDTO> list);
}
