package com.proyecto.software3peid.repositorio;



import com.proyecto.software3peid.entidad.EjeEstrategico;
import com.proyecto.software3peid.entidad.ObjetivoEstrategico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ObjetivoEstrategicoRepo extends JpaRepository<ObjetivoEstrategico, Integer> {

    @Query(value = "SELECT * FROM  ObjetivoEstrategico", nativeQuery = true)
    List<ObjetivoEstrategico> findAllNative();
}
