package com.proyecto.software3peid.controlador;


import com.proyecto.software3peid.entidad.Usuario;
import com.proyecto.software3peid.repositorio.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controlador {


    @Autowired
    UsuarioRepo usuarioRepo;

    @PostMapping("/usuario")
    public Usuario addUsuario(@RequestBody Usuario usuario) {

        return usuarioRepo.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuario() {
        return usuarioRepo.findAll();
    }


    @GetMapping("/msg")
    public String mostrar() {
        return "funciona porfavor llossa";
    }


    @GetMapping("/usuarioList")
    public Usuario obtnertUsuario() {
        Usuario usuario = new Usuario();
        usuario.setCodigo(1);
        usuario.setNombre("toro");
        usuario.setEmail("toro@email.com");
        usuario.setPassword("124");
        return usuario;
    }


}
