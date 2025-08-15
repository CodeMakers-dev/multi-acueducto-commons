package com.codemakers.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.ParametrosSistemaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface ParametrosSistemaRepository extends JpaRepository<ParametrosSistemaEntity, Integer> {

	Optional<ParametrosSistemaEntity> findByLlave(String llave);
}
