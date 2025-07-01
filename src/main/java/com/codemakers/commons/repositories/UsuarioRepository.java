package com.codemakers.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.UsuarioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{

	Optional<UsuarioEntity> findByNombre(String nombre);
	boolean existsByNombre(String nombre);
	Optional<UsuarioEntity> findByPersonaId(Integer personaId);

}
