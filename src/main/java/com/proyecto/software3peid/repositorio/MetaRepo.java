package com.proyecto.software3peid.repositorio;



import com.proyecto.software3peid.entidad.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepo extends JpaRepository<Meta, Integer> {
}
