package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.TelefonoGeneralEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface TelefonoGeneralRepository extends JpaRepository<TelefonoGeneralEntity, Integer> {
	
	boolean existsByNumero(String numero);
}
