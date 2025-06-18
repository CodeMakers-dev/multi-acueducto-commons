package com.codemakers.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemakers.commons.entities.VigenciaUsuarioEntity;

@Repository
public interface VigenciaUsuarioRepository extends JpaRepository<VigenciaUsuarioEntity, Integer>{

}
