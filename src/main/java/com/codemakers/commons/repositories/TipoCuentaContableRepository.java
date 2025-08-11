package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.TipoCuentaContableEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface TipoCuentaContableRepository extends JpaRepository<TipoCuentaContableEntity, Integer> {

}
