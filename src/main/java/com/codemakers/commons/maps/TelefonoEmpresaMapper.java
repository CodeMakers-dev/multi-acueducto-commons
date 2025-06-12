package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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

@Mapper
public interface TelefonoEmpresaMapper {

	TelefonoEmpresaMapper INSTANCE = Mappers.getMapper(TelefonoEmpresaMapper.class);
	
	TelefonoEmpresaEntity dtoToEntity(TelefonoEmpresaDTO dto);
	
	@InheritInverseConfiguration
	TelefonoEmpresaDTO entityToDto(TelefonoEmpresaEntity entity);
	
	List<TelefonoEmpresaDTO> listEntityToDtoList(List<TelefonoEmpresaEntity> list);
	
	List<TelefonoEmpresaEntity> listDtoToEntity(List<TelefonoEmpresaDTO> list);
}
