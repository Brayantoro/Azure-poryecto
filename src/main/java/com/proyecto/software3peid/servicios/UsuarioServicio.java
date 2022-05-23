package com.proyecto.software3peid.servicios;



import com.proyecto.software3peid.Dto.UsuarioDto;
import com.proyecto.software3peid.entidad.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServicio {

List<Usuario>listar();
//Optional getUsuario(int id);
Usuario addUsuario(Usuario u);
Usuario editarUsuario(Usuario u);
void eliminarUsuario(int id);

Usuario findById(Integer id);

boolean existsById(int id);
boolean existsByNombre(String nombre);
Optional<Usuario> getByNombre(String nombre);



}
