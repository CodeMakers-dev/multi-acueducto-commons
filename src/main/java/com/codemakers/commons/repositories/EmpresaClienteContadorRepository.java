package com.codemakers.commons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.EmpresaClienteContadorEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface EmpresaClienteContadorRepository extends JpaRepository<EmpresaClienteContadorEntity, Integer> {
	
	boolean existsByEmpresaIdAndClienteIdAndContadorId(Integer empresaId, Integer clienteId, Integer contadorId);
	List<EmpresaClienteContadorEntity> findByEmpresa_Id(Integer idEmpresa);
}
