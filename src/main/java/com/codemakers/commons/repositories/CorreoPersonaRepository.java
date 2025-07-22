package com.codemakers.commons.repositories;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.CorreoPersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface CorreoPersonaRepository extends JpaRepository<CorreoPersonaEntity, Integer> {
	Optional<CorreoPersonaEntity> findByCorreoIgnoreCase(String correo);

	Optional<CorreoPersonaEntity> findByCorreo(String correo);
	
	Optional<CorreoPersonaEntity> findByPersonaIdAndActivoTrue(Integer personaId);

}
