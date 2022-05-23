package com.proyecto.software3peid.repositorio;



import com.proyecto.software3peid.entidad.EjeEstrategico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EjeEstrategicoRepo extends JpaRepository<EjeEstrategico, Integer> {
    @Query(value = "SELECT * FROM  EjeEstrategico", nativeQuery = true)
    List<EjeEstrategico> findAllNative();
}

