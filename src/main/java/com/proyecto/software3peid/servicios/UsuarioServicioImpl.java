package com.proyecto.software3peid.servicios;

import com.proyecto.software3peid.Dto.UsuarioDto;
import com.proyecto.software3peid.entidad.Usuario;
import com.proyecto.software3peid.repositorio.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

     @Autowired
     UsuarioRepo usuarioRepo;
    @Override
    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }

   // @Override
   // public Optional<Usuario> getUsuario(int id){
       /// return  usuarioRepo.findById(id);
    //}

    @Override
    public Optional<Usuario> getByNombre(String nombre){
        return  usuarioRepo.findByNombre(nombre);
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
    public void eliminarUsuario(int codigo) {
         usuarioRepo.deleteById(codigo);
    }


    @Override
    public Usuario findById(Integer id) {
         return  usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existsById(int id){
        return usuarioRepo.existsById(id);
    }
    @Override
    public boolean existsByNombre(String nombre){
        return usuarioRepo.existsByNombre(nombre);
    }






}
