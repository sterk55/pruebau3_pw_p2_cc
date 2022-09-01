package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IPacienteRepository;
import com.example.demo.uce.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {
    
    @Autowired
    private IPacienteRepository pacienteRepositoryImpl;

    @Override
    public void crear(Paciente paciente) {
        // TODO Auto-generated method stub
        this.pacienteRepositoryImpl.crear(paciente);
        
    }

    @Override
    public List<Paciente> buscarPorCedula(Integer cedula) {
        // TODO Auto-generated method stub
        return this.pacienteRepositoryImpl.buscarPorCedula(cedula);
    
    }
    
}
