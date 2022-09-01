package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteService {
    
    public void crear(Paciente paciente);

    public List<Paciente> buscarPorCedula(Integer cedula);

}
