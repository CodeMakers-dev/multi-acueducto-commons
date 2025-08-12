package com.codemakers.commons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.VentaProductoEntity;

/**
 * @author nicope
 * @version 1.0
 * 
 */

@Repository
public interface VentaProductoRepository extends JpaRepository<VentaProductoEntity, Integer> {

	List<VentaProductoEntity> findByVenta_Id(Integer idVenta);
}
