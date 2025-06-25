package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.PersonaEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {
	boolean existsByNumeroCedula(String numeroCedula);
	boolean existsByNombre(String nombre);
}
