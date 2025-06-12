package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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

@Mapper
public interface EmpresaClienteContadorMapper {

	EmpresaClienteContadorMapper INSTANCE = Mappers.getMapper(EmpresaClienteContadorMapper.class);
	
	EmpresaClienteContadorEntity dtoToEntity(EmpresaClienteContadorDTO dto);
	
	@InheritInverseConfiguration
	EmpresaClienteContadorDTO entityToDto(EmpresaClienteContadorEntity entity);
	
	List<EmpresaClienteContadorDTO> listEntityToDtoList(List<EmpresaClienteContadorEntity> list);
	
	List<EmpresaClienteContadorEntity> listDtoToEntity(List<EmpresaClienteContadorDTO> list);
}
