package com.proyecto.software3peid.controlador;


import com.mysql.cj.util.StringUtils;
import com.proyecto.software3peid.Dto.Mensaje;
import com.proyecto.software3peid.Dto.UsuarioDto;
import com.proyecto.software3peid.entidad.EjeEstrategico;
import com.proyecto.software3peid.entidad.ObjetivoEstrategico;
import com.proyecto.software3peid.entidad.Proyecto;
import com.proyecto.software3peid.entidad.Usuario;
import com.proyecto.software3peid.repositorio.UsuarioRepo;
import com.proyecto.software3peid.servicios.EjeEstrategicoServicio;
import com.proyecto.software3peid.servicios.ObjetivoEstrategicoServicio;
import com.proyecto.software3peid.servicios.ProyectoServicio;
import com.proyecto.software3peid.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peid")
@CrossOrigin
public class Controlador {

    @Autowired
    UsuarioRepo usuarioRepo;



    @Autowired
    UsuarioServicio usuarioServicio;

    @Autowired
    EjeEstrategicoServicio ejeEstrategicoServicio;

    @Autowired
    ObjetivoEstrategicoServicio objetivoEstrategicoServicio;

    @Autowired
    ProyectoServicio proyectoServicio;

    @PostMapping("/usuario")
    public Usuario addUsuario(@RequestBody Usuario usuario) {

        return usuarioRepo.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuario() {
        return usuarioRepo.findAll();
    }


}
