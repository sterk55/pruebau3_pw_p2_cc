package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.modelo.cita_medica;

public interface ICitaMedicaRepository {
    
    public void crear(cita_medica citaMedica);

    public void actualizar(cita_medica citaMedica);

    public List<cita_medica> buscarPendiente();
}

