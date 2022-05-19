package com.proyecto.software3peid.repositorio;



import com.proyecto.software3peid.entidad.EjeEstrategico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EjeEstrategicoRepo extends JpaRepository<EjeEstrategico, Integer> {

}

