package com.proyecto.software3peid.repositorio;


import com.proyecto.software3peid.entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {
}
