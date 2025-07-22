package com.codemakers.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.EmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Integer> {
	
	Optional<EmpresaEntity> findByUsuario_Id(Integer idUsuario);

}
