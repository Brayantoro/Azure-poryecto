package com.proyecto.software3peid.repositorio;


import com.proyecto.software3peid.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Integer> {


}
