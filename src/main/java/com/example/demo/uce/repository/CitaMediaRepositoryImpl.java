package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.cita_medica;

@Repository
@Transactional
public class CitaMediaRepositoryImpl implements ICitaMedicaRepository{
    
    @PersistenceContext
	private EntityManager entityManager;
	
    @Override
    public void crear(cita_medica citaMedica) {
        // TODO Auto-generated method stub
        this.entityManager.persist(citaMedica);
    }

    @Override
    public void actualizar(cita_medica citaMedica) {
        this.entityManager.merge(citaMedica);
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<cita_medica> buscarPendiente() {
        
        TypedQuery<cita_medica> myQuery = this.entityManager.createQuery("SELECT e FROM Cita_Medica e WHERE e.receta = :   ", cita_medica.class);
        // TODO Auto-generated method stub
        return myQuery.getResultList();

    }
    
}
