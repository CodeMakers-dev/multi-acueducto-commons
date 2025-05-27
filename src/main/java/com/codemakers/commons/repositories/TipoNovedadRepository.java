package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.TipoNovedadEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface TipoNovedadRepository extends JpaRepository<TipoNovedadEntity, Integer> {

}
