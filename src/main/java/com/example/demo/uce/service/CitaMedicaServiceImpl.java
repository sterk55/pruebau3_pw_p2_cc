package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.ICitaMedicaRepository;
import com.example.demo.uce.repository.modelo.cita_medica;
@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {


    @Autowired
    private ICitaMedicaRepository citaMediaRepository;

    @Override
    public void crear(cita_medica citaMedica) {
        // TODO Auto-generated method stub
        this.citaMediaRepository.crear(citaMedica);
        
    }

    @Override
    public void actualizar(cita_medica citaMedica) {
        // TODO Auto-generated method stub
        this.citaMediaRepository.actualizar(citaMedica);
        
    }

    @Override
    public List<cita_medica> buscarPendiente() {
        // TODO Auto-generated method stub
        return this.citaMediaRepository.buscarPendiente();
    }
    
}
