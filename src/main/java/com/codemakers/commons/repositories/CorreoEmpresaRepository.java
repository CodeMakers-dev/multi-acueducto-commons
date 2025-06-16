package com.codemakers.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.CorreoEmpresaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface CorreoEmpresaRepository extends JpaRepository<CorreoEmpresaEntity, Integer> {
	Optional<CorreoEmpresaEntity> findByCorreoIgnoreCase(String correo);

}
