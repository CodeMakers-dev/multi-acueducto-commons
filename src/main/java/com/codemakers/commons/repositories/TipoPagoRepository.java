package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.TipoPagoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPagoEntity, Integer> {

}
