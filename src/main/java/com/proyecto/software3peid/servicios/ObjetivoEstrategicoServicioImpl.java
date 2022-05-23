package com.proyecto.software3peid.servicios;


import com.proyecto.software3peid.entidad.ObjetivoEstrategico;
import com.proyecto.software3peid.repositorio.ObjetivoEstrategicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetivoEstrategicoServicioImpl implements ObjetivoEstrategicoServicio{

    @Autowired
    ObjetivoEstrategicoRepo objetivoEstrategicoRepo;
    @Override
    public List<ObjetivoEstrategico> listarObjetivo() {
        return objetivoEstrategicoRepo.findAllNative();
    }
}
