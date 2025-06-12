package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.TelefonoPersonaDTO;
import com.codemakers.commons.entities.TelefonoPersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (TelefonoEmpresaEntity) que permite mapear los datos un objeto de tipo 
 *          (TelefonoPersonaDTO) a uno de tipo (TelefonoEmpresaEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface TelefonoPersonaMapper {

	TelefonoPersonaMapper INSTANCE = Mappers.getMapper(TelefonoPersonaMapper.class);
	
	TelefonoPersonaEntity dtoToEntity(TelefonoPersonaDTO dto);
	
	@InheritInverseConfiguration
	TelefonoPersonaDTO entityToDto(TelefonoPersonaEntity entity);
	
	List<TelefonoPersonaDTO> listEntityToDtoList(List<TelefonoPersonaEntity> list);
	
	List<TelefonoPersonaEntity> listDtoToEntity(List<TelefonoPersonaDTO> list);
}
