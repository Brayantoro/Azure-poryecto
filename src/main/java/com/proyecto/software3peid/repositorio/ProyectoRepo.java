package com.proyecto.software3peid.repositorio;


import com.proyecto.software3peid.entidad.EjeEstrategico;
import com.proyecto.software3peid.entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {

    @Query(value = "SELECT * FROM  Proyecto", nativeQuery = true)
    List<Proyecto> findAllNative();

}
