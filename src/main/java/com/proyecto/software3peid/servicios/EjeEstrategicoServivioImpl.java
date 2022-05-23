package com.proyecto.software3peid.servicios;


import com.proyecto.software3peid.entidad.EjeEstrategico;
import com.proyecto.software3peid.repositorio.EjeEstrategicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjeEstrategicoServivioImpl implements EjeEstrategicoServicio{

      @Autowired
      EjeEstrategicoRepo ejeEstrategicoRepo;

    @Override
    public List<EjeEstrategico> listar() {
         return ejeEstrategicoRepo.findAllNative();
    }
}
