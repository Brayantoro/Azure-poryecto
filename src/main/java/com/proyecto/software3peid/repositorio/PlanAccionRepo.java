package com.proyecto.software3peid.repositorio;



import com.proyecto.software3peid.entidad.PlanAccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanAccionRepo extends JpaRepository<PlanAccion, Integer> {
}
