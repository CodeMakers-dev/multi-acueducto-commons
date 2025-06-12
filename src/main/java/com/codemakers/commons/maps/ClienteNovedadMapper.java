package com.codemakers.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codemakers.commons.dtos.ClienteNovedadDTO;
import com.codemakers.commons.entities.ClienteNovedadEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 *          Clase Mapper de tipo (ClienteNovedadEntity) que permite mapear los datos un objeto de tipo 
 *          (ClienteNovedadDTO) a uno de tipo (ClienteNovedadEntity) o viceversa.
 *          
 *          Esto ayuda a mantener el código limpio y mantenible, ya que separa las 
 *          preocupaciones de las diferentes capas de la aplicación.
 * 
 */

@Mapper
public interface ClienteNovedadMapper {

	ClienteNovedadMapper INSTANCE = Mappers.getMapper(ClienteNovedadMapper.class);
	
	ClienteNovedadEntity dtoToEntity(ClienteNovedadDTO dto);
	
	@InheritInverseConfiguration
	ClienteNovedadDTO entityToDto(ClienteNovedadEntity entity);
	
	List<ClienteNovedadDTO> listEntityToDtoList(List<ClienteNovedadEntity> list);
	
	List<ClienteNovedadEntity> listDtoToEntity(List<ClienteNovedadDTO> list);
}
