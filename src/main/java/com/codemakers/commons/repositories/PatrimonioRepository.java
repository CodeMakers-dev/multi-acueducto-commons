package com.codemakers.commons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.PatrimonioEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface PatrimonioRepository extends JpaRepository<PatrimonioEntity, Integer> {

	List<PatrimonioEntity> findByEmpresa_Id(Integer id);
}
