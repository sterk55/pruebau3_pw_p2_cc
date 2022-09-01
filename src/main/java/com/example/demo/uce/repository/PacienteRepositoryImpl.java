package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{
    
    @PersistenceContext
	private EntityManager entityManager;
    
    @Override
    public void crear(Paciente paciente) {
        this.entityManager.persist(paciente);
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Paciente> buscarPorCedula(Integer cedula) {
        // TODO Auto-generated method stub
        TypedQuery<Paciente> myQuery = this.entityManager.createQuery("SELECT e FROM Paciente e WHERE e.cedula = : cedulaDato", Paciente.class);
        myQuery.setParameter("cedulaDato", cedula);

        return myQuery.getResultList();
    }
    
}
