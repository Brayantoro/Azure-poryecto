package com.proyecto.software3peid.servicios;

import com.proyecto.software3peid.entidad.Usuario;
import com.proyecto.software3peid.repositorio.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

     @Autowired
     UsuarioRepo usuarioRepo;
    @Override
    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario listarId(int codigo) {
        return null;
    }

    @Override
    public Usuario addUsuario(Usuario u) {
        return  usuarioRepo.save(u);
    }

    @Override
    public Usuario editarUsuario(Usuario u) {
        return null;
    }

    @Override
    public Usuario eliminarUsuario(int codigo) {
        return null;
    }
}
