package com.codemakers.commons.repositories;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.CorreoGeneralEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface CorreoGeneralRepository extends JpaRepository<CorreoGeneralEntity, Integer> {
	Optional<CorreoGeneralEntity> findByCorreoIgnoreCase(String correo);

	Optional<CorreoGeneralEntity> findByCorreo(String correo);
	
	Optional<CorreoGeneralEntity> findByPersonaIdAndActivoTrue(Integer personaId);

}
