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

    @GetMapping("/usuarios/{id}")
    public Usuario unUsuario(@PathVariable Integer id) {
        return usuarioServicio.findById(id);
    }


    @PutMapping("/usuarios/{id}")
    public Usuario modificar(@RequestBody Usuario usuario,@PathVariable Integer id){
        Usuario usu=usuarioServicio.findById(id);
        usu.setCodigo(usuario.getCodigo());
        usu.setNombre(usuario.getNombre());
        usu.setEmail(usuario.getEmail());
        usuario.setPassword(usuario.getPassword());
       return usuarioServicio.addUsuario(usu);
    }

    @GetMapping("/usuarios/{id}")
    public void eliminar(@PathVariable Integer id) {
         usuarioServicio.eliminarUsuario(id);
    }

    @GetMapping("/EjeEstrategicos")
    public List<EjeEstrategico> getEjeEstraetgico() {
      return  ejeEstrategicoServicio.listar();
    }

    @GetMapping("/objetivos")
    public List<ObjetivoEstrategico> getObjetivo() {
        return  objetivoEstrategicoServicio.listarObjetivo();
    }


    @GetMapping("/proyectos")
    public List<Proyecto> getProyectos() {
        return proyectoServicio.listaProyectos();
    }


    @GetMapping("/msg")
    public String mostrar() {
        return "funciona perroooooo looooo";
    }



    @GetMapping("/user/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable("id") int id){
        if(!usuarioServicio.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Usuario usuario = (Usuario) usuarioServicio.findById(id);
        return new ResponseEntity(usuario, HttpStatus.OK);
    }

    @GetMapping("/detalleNombre/{nombre}")
    public ResponseEntity<Usuario> getByNombre(@PathVariable("nombre") String nombre){
        if(!usuarioServicio.existsByNombre(nombre))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Usuario usuario = usuarioServicio.getByNombre(nombre).get();
        return new ResponseEntity(usuario, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UsuarioDto usuarioDto){
        if(StringUtils.isNullOrEmpty(usuarioDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(usuarioDto.getCodigo()!=null)
            return new ResponseEntity(new Mensaje("debe ser diferente vacio"), HttpStatus.BAD_REQUEST);
        if(usuarioServicio.existsByNombre(usuarioDto.getNombre()))
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(usuarioDto.getNombre(), usuarioDto.getPassword());
        usuarioServicio.addUsuario(usuario);
        return new ResponseEntity(new Mensaje("Usuario creado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody UsuarioDto usuarioDto){
        if(!usuarioServicio.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(usuarioServicio.existsByNombre(usuarioDto.getNombre()) && usuarioServicio.getByNombre(usuarioDto.getNombre()).get().getCodigo() != id)
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isNullOrEmpty(usuarioDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(usuarioDto.getCodigo()!=null)
            return new ResponseEntity(new Mensaje("diferente null"), HttpStatus.BAD_REQUEST);

        Usuario usuario = (Usuario) usuarioServicio.findById(id);
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setPassword(usuarioDto.getPassword());
        usuario.setEmail(usuarioDto.getEmail());

        usuarioServicio.addUsuario(usuario);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!usuarioServicio.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        usuarioServicio.eliminarUsuario(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }








}
