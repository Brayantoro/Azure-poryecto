package com.proyecto.software3peid.controlador;


import com.proyecto.software3peid.Dto.UsuarioDto;
import com.proyecto.software3peid.entidad.EjeEstrategico;
import com.proyecto.software3peid.entidad.Usuario;
import com.proyecto.software3peid.repositorio.EjeEstrategicoRepo;
import com.proyecto.software3peid.repositorio.UsuarioRepo;
import com.proyecto.software3peid.servicios.EjeEstrategicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peid")
public class Controlador {


    @Autowired
    UsuarioRepo usuarioRepo;


    @Autowired
    EjeEstrategicoServicio ejeEstrategicoServicio;

    @PostMapping("/usuario")
    public Usuario addUsuario(@RequestBody Usuario usuario) {

        return usuarioRepo.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuario() {
        return usuarioRepo.findAll();
    }

    @GetMapping("/EjeEstrategicos")
    public List<EjeEstrategico> getEjeEstraetgico() {
      return  ejeEstrategicoServicio.listar();
    }








    @GetMapping("/msg")
    public String mostrar() {
        return "funciona porfavor llossa";
    }


    @GetMapping("/listaQuemada")
    public UsuarioDto obtnertUsuario() {
        UsuarioDto usuario = new UsuarioDto();
        usuario.setCodigo(1);
        usuario.setNombre("toro");
        usuario.setEmail("toro@email.com");
        usuario.setPassword("124");

        UsuarioDto usuario1 = new UsuarioDto();
        usuario1.setCodigo(1);
        usuario1.setNombre("fabian");
        usuario1.setEmail("fabian@email.com");
        usuario1.setPassword("2345");

        UsuarioDto usuario2 = new UsuarioDto();
        usuario2.setCodigo(1);
        usuario2.setNombre("Anyela");
        usuario2.setEmail("Anyela@email.com");
        usuario2.setPassword("456");

        UsuarioDto usuario3 = new UsuarioDto();
        usuario3.setCodigo(1);
        usuario3.setNombre("carlos");
        usuario3.setEmail("carlos@email.com");
        usuario3.setPassword("456");
        return usuario;
    }











}
