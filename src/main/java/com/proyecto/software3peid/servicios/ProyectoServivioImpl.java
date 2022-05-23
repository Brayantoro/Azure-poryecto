package com.proyecto.software3peid.servicios;


import com.proyecto.software3peid.entidad.Proyecto;
import com.proyecto.software3peid.repositorio.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServivioImpl implements ProyectoServicio{

    @Autowired
    ProyectoRepo proyectoRepo;

    @Override
    public List<Proyecto> listaProyectos() {
        return  proyectoRepo.findAllNative();
    }
}
