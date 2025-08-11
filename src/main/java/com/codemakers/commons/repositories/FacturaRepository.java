package com.codemakers.commons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.FacturaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {
	
	List<FacturaEntity> findByEmpresaClienteContador_Empresa_Id(Integer idEmpresa);

}
