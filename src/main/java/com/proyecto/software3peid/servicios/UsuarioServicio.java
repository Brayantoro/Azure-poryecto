package com.proyecto.software3peid.servicios;



import com.proyecto.software3peid.entidad.Usuario;

import java.util.List;

public interface UsuarioServicio {

List<Usuario>listar();
Usuario listarId(int id);
Usuario addUsuario(Usuario u);
Usuario editarUsuario(Usuario u);
Usuario eliminarUsuario(int id);


}
