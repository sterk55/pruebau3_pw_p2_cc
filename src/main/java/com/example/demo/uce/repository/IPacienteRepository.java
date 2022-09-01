package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteRepository {
    
    public void crear(Paciente paciente);

    public List<Paciente> buscarPorCedula(Integer cedula);
}
