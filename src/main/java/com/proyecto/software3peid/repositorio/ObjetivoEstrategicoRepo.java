package com.proyecto.software3peid.repositorio;


import com.proyecto.software3peid.entidad.ObjetivoEstrategico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ObjetivoEstrategicoRepo extends JpaRepository<ObjetivoEstrategico, Integer> {
}
